package FAAuthenticator;

import java.security.GeneralSecurityException;

public class FAAuthen {

    private final String secretKey;
    private String FACode;
    private long seconds;

    public FAAuthen(String secretKey) {
        this.secretKey = secretKey;
        seconds = TimeBasedOneTimePasswordUtil.DEFAULT_TIME_STEP_SECONDS
                - ((System.currentTimeMillis() / 1000) % TimeBasedOneTimePasswordUtil.DEFAULT_TIME_STEP_SECONDS);
        try {
            this.FACode = TimeBasedOneTimePasswordUtil.generateCurrentNumberString(secretKey);
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        }
    }

    public String getSecretKey() {
        return secretKey;
    }

    public String getFACode() {
        return FACode;
    }

    public void setFACode(String FACode) {
        this.FACode = FACode;
    }

    public long getSeconds() {
        return seconds;
    }

    public void setSeconds(long seconds) {
        this.seconds = seconds;
    }
}
