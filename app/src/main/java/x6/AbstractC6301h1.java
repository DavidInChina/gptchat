package x6;

import android.gov.nist.javax.sip.header.ParameterNames;

/* renamed from: x6.h1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC6301h1 {
    public static /* synthetic */ String a(int i10) {
        switch (i10) {
            case 1:
                return "android";
            case 2:
                return "ios";
            case 3:
                return "browser";
            case 4:
                return "flutter";
            case 5:
                return "react-native";
            case 6:
                return "roku";
            case 7:
                return "unity";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String b(int i10) {
        switch (i10) {
            case 1:
                return "document";
            case 2:
                return "xhr";
            case 3:
                return "beacon";
            case 4:
                return "fetch";
            case 5:
                return "css";
            case 6:
                return "js";
            case 7:
                return "image";
            case 8:
                return "font";
            case 9:
                return "media";
            case 10:
                return "other";
            case 11:
                return "native";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String c(int i10) {
        switch (i10) {
            case 1:
                return "user_app_launch";
            case 2:
                return "inactivity_timeout";
            case 3:
                return "max_duration";
            case 4:
                return "background_launch";
            case 5:
                return "prewarm";
            case 6:
                return "from_non_interactive_session";
            case 7:
                return "explicit_stop";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String d(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return "maybe";
                }
                throw null;
            }
            return "not_connected";
        }
        return "connected";
    }

    public static /* synthetic */ String e(int i10) {
        switch (i10) {
            case 1:
                return "mobile";
            case 2:
                return "desktop";
            case 3:
                return "tablet";
            case 4:
                return "tv";
            case 5:
                return "gaming_console";
            case 6:
                return "bot";
            case 7:
                return "other";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String f(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return "4g";
                    }
                    throw null;
                }
                return "3g";
            }
            return "2g";
        }
        return "slow_2g";
    }

    public static /* synthetic */ String g(int i10) {
        switch (i10) {
            case 1:
                return "initial_load";
            case 2:
                return "route_change";
            case 3:
                return "activity_display";
            case 4:
                return "activity_redisplay";
            case 5:
                return "fragment_display";
            case 6:
                return "fragment_redisplay";
            case 7:
                return "view_controller_display";
            case 8:
                return "view_controller_redisplay";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String h(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return "mask-user-input";
                }
                throw null;
            }
            return "mask";
        }
        return "allow";
    }

    public static /* synthetic */ String i(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            return "terminated";
                        }
                        throw null;
                    }
                    return "frozen";
                }
                return ParameterNames.HIDDEN;
            }
            return "passive";
        }
        return "active";
    }

    public static /* synthetic */ String j(int i10) {
        switch (i10) {
            case 1:
                return "android";
            case 2:
                return "ios";
            case 3:
                return "browser";
            case 4:
                return "flutter";
            case 5:
                return "react-native";
            case 6:
                return "roku";
            case 7:
                return "unity";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String k(int i10) {
        switch (i10) {
            case 1:
                return "ANDROID";
            case 2:
                return "IOS";
            case 3:
                return "BROWSER";
            case 4:
                return "FLUTTER";
            case 5:
                return "REACT_NATIVE";
            case 6:
                return "ROKU";
            case 7:
                return "UNITY";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String l(int i10) {
        switch (i10) {
            case 1:
                return "DOCUMENT";
            case 2:
                return "XHR";
            case 3:
                return "BEACON";
            case 4:
                return "FETCH";
            case 5:
                return "CSS";
            case 6:
                return "JS";
            case 7:
                return "IMAGE";
            case 8:
                return "FONT";
            case 9:
                return "MEDIA";
            case 10:
                return "OTHER";
            case 11:
                return "NATIVE";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String m(int i10) {
        switch (i10) {
            case 1:
                return "USER_APP_LAUNCH";
            case 2:
                return "INACTIVITY_TIMEOUT";
            case 3:
                return "MAX_DURATION";
            case 4:
                return "BACKGROUND_LAUNCH";
            case 5:
                return "PREWARM";
            case 6:
                return "FROM_NON_INTERACTIVE_SESSION";
            case 7:
                return "EXPLICIT_STOP";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String n(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return "null";
                }
                return "MAYBE";
            }
            return "NOT_CONNECTED";
        }
        return "CONNECTED";
    }

    public static /* synthetic */ String o(int i10) {
        switch (i10) {
            case 1:
                return "MOBILE";
            case 2:
                return "DESKTOP";
            case 3:
                return "TABLET";
            case 4:
                return "TV";
            case 5:
                return "GAMING_CONSOLE";
            case 6:
                return "BOT";
            case 7:
                return "OTHER";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String p(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return "null";
                    }
                    return "4G";
                }
                return "3G";
            }
            return "2G";
        }
        return "SLOW_2G";
    }

    public static /* synthetic */ String q(int i10) {
        switch (i10) {
            case 1:
                return "INITIAL_LOAD";
            case 2:
                return "ROUTE_CHANGE";
            case 3:
                return "ACTIVITY_DISPLAY";
            case 4:
                return "ACTIVITY_REDISPLAY";
            case 5:
                return "FRAGMENT_DISPLAY";
            case 6:
                return "FRAGMENT_REDISPLAY";
            case 7:
                return "VIEW_CONTROLLER_DISPLAY";
            case 8:
                return "VIEW_CONTROLLER_REDISPLAY";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String r(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return "null";
                }
                return "MASK_USER_INPUT";
            }
            return "MASK";
        }
        return "ALLOW";
    }

    public static /* synthetic */ String s(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return "null";
                        }
                        return "TERMINATED";
                    }
                    return "FROZEN";
                }
                return "HIDDEN";
            }
            return "PASSIVE";
        }
        return "ACTIVE";
    }

    public static /* synthetic */ String t(int i10) {
        switch (i10) {
            case 1:
                return "ANDROID";
            case 2:
                return "IOS";
            case 3:
                return "BROWSER";
            case 4:
                return "FLUTTER";
            case 5:
                return "REACT_NATIVE";
            case 6:
                return "ROKU";
            case 7:
                return "UNITY";
            default:
                return "null";
        }
    }
}
