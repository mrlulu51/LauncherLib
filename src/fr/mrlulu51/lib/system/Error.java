package fr.mrlulu51.lib.system;

import fr.mrlulu51.lib.interfaces.ErrorPrefixEnum;

public class Error {

    private static ErrorPrefixEnum prefixInfo = ErrorPrefixEnum.INFO;
    private static ErrorPrefixEnum prefixWarning = ErrorPrefixEnum.WARNING;
    private static ErrorPrefixEnum prefixError = ErrorPrefixEnum.ERROR;
    private static ErrorPrefixEnum prefixCritical = ErrorPrefixEnum.CRITICAL;

    public static void printInfo(String info) {
        System.out.println("[Launcher Lib] " + "[" + prefixInfo + "/System]: " + info);
    }

    public static void printWarn(String warning) {
        System.out.println("[Launcher Lib] " + "[" + prefixWarning + "/System]: " + warning);
    }

    public static Throwable printError(String error) {
        throw new IllegalArgumentException("[Launcher Lib] " + "[" + prefixError + "/System]: " + error);
    }

    public static Throwable printCriticalError(String critical) {
        throw new IllegalArgumentException("[Launcher Lib] " + "[" + prefixCritical + "/System]: " + critical);
    }
}
