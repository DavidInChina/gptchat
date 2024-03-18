package x6;

import android.gov.nist.javax.sip.parser.TokenNames;
import livekit.org.webrtc.MediaStreamTrack;

/* renamed from: x6.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC6287d {
    public static /* synthetic */ String A(int i10) {
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

    public static /* synthetic */ String B(int i10) {
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

    public static /* synthetic */ String C(int i10) {
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

    public static /* synthetic */ String D(int i10) {
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

    public static /* synthetic */ String E(int i10) {
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

    public static /* synthetic */ String F(int i10) {
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

    public static /* synthetic */ String G(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return "null";
                }
                return "CI_TEST";
            }
            return "SYNTHETICS";
        }
        return "USER";
    }

    public static /* synthetic */ String H(int i10) {
        switch (i10) {
            case 1:
                return "NETWORK";
            case 2:
                return "SOURCE";
            case 3:
                return "CONSOLE";
            case 4:
                return "LOGGER";
            case 5:
                return "AGENT";
            case 6:
                return "WEBVIEW";
            case 7:
                return "CUSTOM";
            case 8:
                return "REPORT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String I(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return "null";
            }
            return "UNHANDLED";
        }
        return "HANDLED";
    }

    public static /* synthetic */ String J(int i10) {
        switch (i10) {
            case 1:
                return "POST";
            case 2:
                return "GET";
            case 3:
                return "HEAD";
            case 4:
                return "PUT";
            case 5:
                return "DELETE";
            case 6:
                return "PATCH";
            case 7:
                return "TRACE";
            case 8:
                return TokenNames.OPTIONS;
            case 9:
                return "CONNECT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String K(int i10) {
        switch (i10) {
            case 1:
                return "AD";
            case 2:
                return "ADVERTISING";
            case 3:
                return "ANALYTICS";
            case 4:
                return "CDN";
            case 5:
                return "CONTENT";
            case 6:
                return "CUSTOMER_SUCCESS";
            case 7:
                return "FIRST_PARTY";
            case 8:
                return "HOSTING";
            case 9:
                return "MARKETING";
            case 10:
                return "OTHER";
            case 11:
                return "SOCIAL";
            case 12:
                return "TAG_MANAGER";
            case 13:
                return "UTILITY";
            case 14:
                return "VIDEO";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String L(int i10) {
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

    public static /* synthetic */ String M(int i10) {
        switch (i10) {
            case 1:
                return "ANDROID";
            case 2:
                return "BROWSER";
            case 3:
                return "IOS";
            case 4:
                return "REACT_NATIVE";
            case 5:
                return "FLUTTER";
            case 6:
                return "ROKU";
            case 7:
                return "NDK";
            case 8:
                return "IOS_IL2CPP";
            case 9:
                return "NDK_IL2CPP";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String N(int i10) {
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

    public static /* synthetic */ String O(int i10) {
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

    public static /* synthetic */ String P(int i10) {
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

    public static /* synthetic */ String Q(int i10) {
        switch (i10) {
            case 1:
                return "CUSTOM";
            case 2:
                return "CLICK";
            case 3:
                return "TAP";
            case 4:
                return "SCROLL";
            case 5:
                return "SWIPE";
            case 6:
                return "APPLICATION_START";
            case 7:
                return "BACK";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String R(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return "null";
                }
                return "CI_TEST";
            }
            return "SYNTHETICS";
        }
        return "USER";
    }

    public static /* synthetic */ String S(int i10) {
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

    public static /* synthetic */ String T(int i10) {
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

    public static /* synthetic */ String U(int i10) {
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

    public static /* synthetic */ String V(int i10) {
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

    public static /* synthetic */ String W(int i10) {
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

    public static /* synthetic */ String X(int i10) {
        switch (i10) {
            case 1:
                return "POST";
            case 2:
                return "GET";
            case 3:
                return "HEAD";
            case 4:
                return "PUT";
            case 5:
                return "DELETE";
            case 6:
                return "PATCH";
            case 7:
                return "TRACE";
            case 8:
                return TokenNames.OPTIONS;
            case 9:
                return "CONNECT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String Y(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return "null";
                }
                return "SUBSCRIPTION";
            }
            return "MUTATION";
        }
        return "QUERY";
    }

    public static /* synthetic */ String Z(int i10) {
        switch (i10) {
            case 1:
                return "AD";
            case 2:
                return "ADVERTISING";
            case 3:
                return "ANALYTICS";
            case 4:
                return "CDN";
            case 5:
                return "CONTENT";
            case 6:
                return "CUSTOMER_SUCCESS";
            case 7:
                return "FIRST_PARTY";
            case 8:
                return "HOSTING";
            case 9:
                return "MARKETING";
            case 10:
                return "OTHER";
            case 11:
                return "SOCIAL";
            case 12:
                return "TAG_MANAGER";
            case 13:
                return "UTILITY";
            case 14:
                return "VIDEO";
            default:
                return "null";
        }
    }

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

    public static /* synthetic */ String a0(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return "null";
                }
                return "CI_TEST";
            }
            return "SYNTHETICS";
        }
        return "USER";
    }

    public static /* synthetic */ String b(int i10) {
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

    public static /* synthetic */ String b0(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return "null";
                }
                return "CI_TEST";
            }
            return "SYNTHETICS";
        }
        return "USER";
    }

    public static /* synthetic */ String c(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return "ci_test";
                }
                throw null;
            }
            return "synthetics";
        }
        return "user";
    }

    public static /* synthetic */ String c0(int i10) {
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

    public static /* synthetic */ String d(int i10) {
        switch (i10) {
            case 1:
                return "network";
            case 2:
                return "source";
            case 3:
                return "console";
            case 4:
                return "logger";
            case 5:
                return "agent";
            case 6:
                return "webview";
            case 7:
                return "custom";
            case 8:
                return "report";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String d0(int i10) {
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

    public static /* synthetic */ String e(int i10) {
        if (i10 != 1) {
            if (i10 == 2) {
                return "unhandled";
            }
            throw null;
        }
        return "handled";
    }

    public static /* synthetic */ String e0(int i10) {
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

    public static /* synthetic */ String f(int i10) {
        switch (i10) {
            case 1:
                return "POST";
            case 2:
                return "GET";
            case 3:
                return "HEAD";
            case 4:
                return "PUT";
            case 5:
                return "DELETE";
            case 6:
                return "PATCH";
            case 7:
                return "TRACE";
            case 8:
                return TokenNames.OPTIONS;
            case 9:
                return "CONNECT";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String f0(int i10) {
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

    public static /* synthetic */ String g(int i10) {
        switch (i10) {
            case 1:
                return "ad";
            case 2:
                return "advertising";
            case 3:
                return "analytics";
            case 4:
                return "cdn";
            case 5:
                return "content";
            case 6:
                return "customer-success";
            case 7:
                return "first party";
            case 8:
                return "hosting";
            case 9:
                return "marketing";
            case 10:
                return "other";
            case 11:
                return "social";
            case 12:
                return "tag-manager";
            case 13:
                return "utility";
            case 14:
                return MediaStreamTrack.VIDEO_TRACK_KIND;
            default:
                throw null;
        }
    }

    public static /* synthetic */ String g0(int i10) {
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

    public static /* synthetic */ String h(int i10) {
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

    public static /* synthetic */ String h0(int i10) {
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

    public static /* synthetic */ String i(int i10) {
        switch (i10) {
            case 1:
                return "android";
            case 2:
                return "browser";
            case 3:
                return "ios";
            case 4:
                return "react-native";
            case 5:
                return "flutter";
            case 6:
                return "roku";
            case 7:
                return "ndk";
            case 8:
                return "ios+il2cpp";
            case 9:
                return "ndk+il2cpp";
            default:
                throw null;
        }
    }

    public static /* synthetic */ int i0(String str) {
        if (str != null) {
            if (str.equals("CONNECTED")) {
                return 1;
            }
            if (str.equals("NOT_CONNECTED")) {
                return 2;
            }
            if (str.equals("MAYBE")) {
                return 3;
            }
            throw new IllegalArgumentException("No enum constant com.datadog.android.rum.model.ErrorEvent.Status.".concat(str));
        }
        throw new NullPointerException("Name is null");
    }

    public static /* synthetic */ String j(int i10) {
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

    public static /* synthetic */ int j0(String str) {
        if (str != null) {
            if (str.equals("QUERY")) {
                return 1;
            }
            if (str.equals("MUTATION")) {
                return 2;
            }
            if (str.equals("SUBSCRIPTION")) {
                return 3;
            }
            throw new IllegalArgumentException("No enum constant com.datadog.android.rum.model.ResourceEvent.OperationType.".concat(str));
        }
        throw new NullPointerException("Name is null");
    }

    public static /* synthetic */ String k(int i10) {
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

    public static /* synthetic */ String l(int i10) {
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

    public static /* synthetic */ String m(int i10) {
        switch (i10) {
            case 1:
                return "custom";
            case 2:
                return "click";
            case 3:
                return "tap";
            case 4:
                return "scroll";
            case 5:
                return "swipe";
            case 6:
                return "application_start";
            case 7:
                return "back";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String n(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return "ci_test";
                }
                throw null;
            }
            return "synthetics";
        }
        return "user";
    }

    public static /* synthetic */ String o(int i10) {
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

    public static /* synthetic */ String p(int i10) {
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

    public static /* synthetic */ String q(int i10) {
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

    public static /* synthetic */ String r(int i10) {
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

    public static /* synthetic */ String s(int i10) {
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

    public static /* synthetic */ String t(int i10) {
        switch (i10) {
            case 1:
                return "POST";
            case 2:
                return "GET";
            case 3:
                return "HEAD";
            case 4:
                return "PUT";
            case 5:
                return "DELETE";
            case 6:
                return "PATCH";
            case 7:
                return "TRACE";
            case 8:
                return TokenNames.OPTIONS;
            case 9:
                return "CONNECT";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String u(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return "subscription";
                }
                throw null;
            }
            return "mutation";
        }
        return "query";
    }

    public static /* synthetic */ String v(int i10) {
        switch (i10) {
            case 1:
                return "ad";
            case 2:
                return "advertising";
            case 3:
                return "analytics";
            case 4:
                return "cdn";
            case 5:
                return "content";
            case 6:
                return "customer-success";
            case 7:
                return "first party";
            case 8:
                return "hosting";
            case 9:
                return "marketing";
            case 10:
                return "other";
            case 11:
                return "social";
            case 12:
                return "tag-manager";
            case 13:
                return "utility";
            case 14:
                return MediaStreamTrack.VIDEO_TRACK_KIND;
            default:
                throw null;
        }
    }

    public static /* synthetic */ String w(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return "ci_test";
                }
                throw null;
            }
            return "synthetics";
        }
        return "user";
    }

    public static /* synthetic */ String x(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return "ci_test";
                }
                throw null;
            }
            return "synthetics";
        }
        return "user";
    }

    public static /* synthetic */ String y(int i10) {
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

    public static /* synthetic */ String z(int i10) {
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
}
