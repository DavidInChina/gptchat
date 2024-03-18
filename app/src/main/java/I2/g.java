package I2;

import A2.RunnableC0069m;
import android.content.Context;
import android.gov.nist.javax.sdp.fields.SDPKeywords;
import android.gov.nist.javax.sip.ListeningPointExt;
import android.gov.nist.javax.sip.parser.TokenTypes;
import android.os.Handler;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.statsig.androidsdk.StatsigLoggerKt;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import m.RunnableC4517N;
import r9.y;
import s2.AbstractC5532b;
import s2.s;
import s2.w;
import v2.F;
import x8.N;
import x8.P;
import x8.k0;

/* loaded from: classes2.dex */
public final class g implements c, F {

    /* renamed from: n  reason: collision with root package name */
    public static final k0 f7974n = N.r0(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* renamed from: o  reason: collision with root package name */
    public static final k0 f7975o = N.r0(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* renamed from: p  reason: collision with root package name */
    public static final k0 f7976p = N.r0(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* renamed from: q  reason: collision with root package name */
    public static final k0 f7977q = N.r0(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* renamed from: r  reason: collision with root package name */
    public static final k0 f7978r = N.r0(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* renamed from: s  reason: collision with root package name */
    public static final k0 f7979s = N.r0(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* renamed from: t  reason: collision with root package name */
    public static g f7980t;

    /* renamed from: a  reason: collision with root package name */
    public final P f7981a;

    /* renamed from: b  reason: collision with root package name */
    public final F4.a f7982b = new F4.a(22);

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC5532b f7983c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f7984d;

    /* renamed from: e  reason: collision with root package name */
    public final p f7985e;

    /* renamed from: f  reason: collision with root package name */
    public int f7986f;

    /* renamed from: g  reason: collision with root package name */
    public long f7987g;

    /* renamed from: h  reason: collision with root package name */
    public long f7988h;

    /* renamed from: i  reason: collision with root package name */
    public long f7989i;

    /* renamed from: j  reason: collision with root package name */
    public long f7990j;

    /* renamed from: k  reason: collision with root package name */
    public long f7991k;

    /* renamed from: l  reason: collision with root package name */
    public long f7992l;

    /* renamed from: m  reason: collision with root package name */
    public int f7993m;

    public g(Context context, HashMap hashMap, int i10, w wVar, boolean z10) {
        this.f7981a = P.b(hashMap);
        this.f7985e = new p(i10);
        this.f7983c = wVar;
        this.f7984d = z10;
        if (context != null) {
            s c10 = s.c(context);
            int d10 = c10.d();
            this.f7993m = d10;
            this.f7991k = b(d10);
            e eVar = new e(this);
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) c10.f45183c;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null) {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            copyOnWriteArrayList.add(new WeakReference(eVar));
            ((Handler) c10.f45182b).post(new RunnableC4517N(c10, 6, eVar));
            return;
        }
        this.f7993m = 0;
        this.f7991k = b(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:708:0x0cd7, code lost:
        if (r8.equals("AI") == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int[] a(String str) {
        char c10 = 4;
        str.getClass();
        switch (str.hashCode()) {
            case TokenTypes.CONTENT_ENCODING /* 2083 */:
                if (str.equals("AD")) {
                    c10 = 0;
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.CONTENT_LENGTH /* 2084 */:
                if (str.equals("AE")) {
                    c10 = 1;
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.SUBJECT /* 2085 */:
                if (str.equals("AF")) {
                    c10 = 2;
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.CONTENT_TYPE /* 2086 */:
                if (str.equals("AG")) {
                    c10 = 3;
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.CALL_ID /* 2088 */:
                break;
            case TokenTypes.ENCRYPTION /* 2091 */:
                if (str.equals("AL")) {
                    c10 = 5;
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.RECORD_ROUTE /* 2092 */:
                if (str.equals("AM")) {
                    c10 = 6;
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.CSEQ /* 2094 */:
                if (str.equals("AO")) {
                    c10 = 7;
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.WWW_AUTHENTICATE /* 2096 */:
                if (str.equals("AQ")) {
                    c10 = '\b';
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.RESPONSE_KEY /* 2097 */:
                if (str.equals("AR")) {
                    c10 = '\t';
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.HIDE /* 2098 */:
                if (str.equals("AS")) {
                    c10 = '\n';
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.CALL_INFO /* 2099 */:
                if (str.equals("AT")) {
                    c10 = 11;
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.CONTENT_DISPOSITION /* 2100 */:
                if (str.equals("AU")) {
                    c10 = '\f';
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.NOTIFY /* 2102 */:
                if (str.equals("AW")) {
                    c10 = '\r';
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.TIMESTAMP /* 2103 */:
                if (str.equals("AX")) {
                    c10 = 14;
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.TEL /* 2105 */:
                if (str.equals("AZ")) {
                    c10 = 15;
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.EVENT /* 2111 */:
                if (str.equals("BA")) {
                    c10 = 16;
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.AUTHENTICATION_INFO /* 2112 */:
                if (str.equals("BB")) {
                    c10 = 17;
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.REFER_TO /* 2114 */:
                if (str.equals("BD")) {
                    c10 = 18;
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.PUBLISH /* 2115 */:
                if (str.equals("BE")) {
                    c10 = 19;
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.SIP_ETAG /* 2116 */:
                if (str.equals("BF")) {
                    c10 = 20;
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.SIP_IF_MATCH /* 2117 */:
                if (str.equals("BG")) {
                    c10 = 21;
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.MESSAGE /* 2118 */:
                if (str.equals("BH")) {
                    c10 = 22;
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.PATH /* 2119 */:
                if (str.equals("BI")) {
                    c10 = 23;
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.SERVICE_ROUTE /* 2120 */:
                if (str.equals("BJ")) {
                    c10 = 24;
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.P_PREFERRED_IDENTITY /* 2122 */:
                if (str.equals("BL")) {
                    c10 = 25;
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.P_VISITED_NETWORK_ID /* 2123 */:
                if (str.equals("BM")) {
                    c10 = 26;
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.P_CHARGING_FUNCTION_ADDRESSES /* 2124 */:
                if (str.equals("BN")) {
                    c10 = 27;
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.P_VECTOR_CHARGING /* 2125 */:
                if (str.equals("BO")) {
                    c10 = 28;
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.P_ACCESS_NETWORK_INFO /* 2127 */:
                if (str.equals("BQ")) {
                    c10 = 29;
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.P_CALLED_PARTY_ID /* 2128 */:
                if (str.equals("BR")) {
                    c10 = 30;
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.P_ASSOCIATED_URI /* 2129 */:
                if (str.equals("BS")) {
                    c10 = 31;
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.P_MEDIA_AUTHORIZATION /* 2130 */:
                if (str.equals("BT")) {
                    c10 = ' ';
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.SESSIONEXPIRES_TO /* 2133 */:
                if (str.equals("BW")) {
                    c10 = '!';
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.REPLACES_TO /* 2135 */:
                if (str.equals("BY")) {
                    c10 = '\"';
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.SIPS /* 2136 */:
                if (str.equals("BZ")) {
                    c10 = '#';
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.P_PROFILE_KEY /* 2142 */:
                if (str.equals("CA")) {
                    c10 = '$';
                    break;
                }
                c10 = '\uffff';
                break;
            case TokenTypes.P_ASSERTED_SERVICE /* 2145 */:
                if (str.equals("CD")) {
                    c10 = '%';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2147:
                if (str.equals("CF")) {
                    c10 = '&';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2148:
                if (str.equals("CG")) {
                    c10 = '\'';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2149:
                if (str.equals("CH")) {
                    c10 = '(';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2150:
                if (str.equals("CI")) {
                    c10 = ')';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2152:
                if (str.equals("CK")) {
                    c10 = '*';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2153:
                if (str.equals("CL")) {
                    c10 = '+';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2154:
                if (str.equals("CM")) {
                    c10 = ',';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2155:
                if (str.equals("CN")) {
                    c10 = '-';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2156:
                if (str.equals("CO")) {
                    c10 = '.';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2159:
                if (str.equals("CR")) {
                    c10 = '/';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2162:
                if (str.equals("CU")) {
                    c10 = '0';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2163:
                if (str.equals("CV")) {
                    c10 = '1';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2164:
                if (str.equals("CW")) {
                    c10 = '2';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2165:
                if (str.equals("CX")) {
                    c10 = '3';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2166:
                if (str.equals("CY")) {
                    c10 = '4';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2167:
                if (str.equals("CZ")) {
                    c10 = '5';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2177:
                if (str.equals("DE")) {
                    c10 = '6';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2182:
                if (str.equals("DJ")) {
                    c10 = '7';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2183:
                if (str.equals("DK")) {
                    c10 = '8';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2185:
                if (str.equals("DM")) {
                    c10 = '9';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2187:
                if (str.equals("DO")) {
                    c10 = ':';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2198:
                if (str.equals("DZ")) {
                    c10 = ';';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2206:
                if (str.equals("EC")) {
                    c10 = '<';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2208:
                if (str.equals("EE")) {
                    c10 = '=';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2210:
                if (str.equals("EG")) {
                    c10 = '>';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2221:
                if (str.equals("ER")) {
                    c10 = '?';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2222:
                if (str.equals("ES")) {
                    c10 = '@';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2223:
                if (str.equals("ET")) {
                    c10 = 'A';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2243:
                if (str.equals("FI")) {
                    c10 = 'B';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2244:
                if (str.equals("FJ")) {
                    c10 = 'C';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2245:
                if (str.equals("FK")) {
                    c10 = 'D';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2247:
                if (str.equals("FM")) {
                    c10 = 'E';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2249:
                if (str.equals("FO")) {
                    c10 = 'F';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2252:
                if (str.equals("FR")) {
                    c10 = 'G';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2266:
                if (str.equals("GA")) {
                    c10 = 'H';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2267:
                if (str.equals("GB")) {
                    c10 = 'I';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2269:
                if (str.equals("GD")) {
                    c10 = 'J';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2270:
                if (str.equals("GE")) {
                    c10 = 'K';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2271:
                if (str.equals("GF")) {
                    c10 = 'L';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2272:
                if (str.equals("GG")) {
                    c10 = 'M';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2273:
                if (str.equals("GH")) {
                    c10 = 'N';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2274:
                if (str.equals("GI")) {
                    c10 = 'O';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2277:
                if (str.equals("GL")) {
                    c10 = 'P';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2278:
                if (str.equals("GM")) {
                    c10 = 'Q';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2279:
                if (str.equals("GN")) {
                    c10 = 'R';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2281:
                if (str.equals("GP")) {
                    c10 = 'S';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2282:
                if (str.equals("GQ")) {
                    c10 = 'T';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2283:
                if (str.equals("GR")) {
                    c10 = 'U';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2285:
                if (str.equals("GT")) {
                    c10 = 'V';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2286:
                if (str.equals("GU")) {
                    c10 = 'W';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2288:
                if (str.equals("GW")) {
                    c10 = 'X';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2290:
                if (str.equals("GY")) {
                    c10 = 'Y';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2307:
                if (str.equals("HK")) {
                    c10 = 'Z';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2314:
                if (str.equals("HR")) {
                    c10 = '[';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2316:
                if (str.equals("HT")) {
                    c10 = '\\';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2317:
                if (str.equals("HU")) {
                    c10 = ']';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2331:
                if (str.equals("ID")) {
                    c10 = '^';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2332:
                if (str.equals("IE")) {
                    c10 = '_';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2339:
                if (str.equals("IL")) {
                    c10 = '`';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2340:
                if (str.equals("IM")) {
                    c10 = 'a';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2341:
                if (str.equals(SDPKeywords.IN)) {
                    c10 = 'b';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2342:
                if (str.equals("IO")) {
                    c10 = 'c';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2344:
                if (str.equals("IQ")) {
                    c10 = 'd';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2345:
                if (str.equals("IR")) {
                    c10 = 'e';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2346:
                if (str.equals("IS")) {
                    c10 = 'f';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2347:
                if (str.equals("IT")) {
                    c10 = 'g';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2363:
                if (str.equals("JE")) {
                    c10 = 'h';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2371:
                if (str.equals("JM")) {
                    c10 = 'i';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2373:
                if (str.equals("JO")) {
                    c10 = 'j';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2374:
                if (str.equals("JP")) {
                    c10 = 'k';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2394:
                if (str.equals("KE")) {
                    c10 = 'l';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2396:
                if (str.equals("KG")) {
                    c10 = 'm';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2397:
                if (str.equals("KH")) {
                    c10 = 'n';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2398:
                if (str.equals("KI")) {
                    c10 = 'o';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2402:
                if (str.equals("KM")) {
                    c10 = 'p';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2403:
                if (str.equals("KN")) {
                    c10 = 'q';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2407:
                if (str.equals("KR")) {
                    c10 = 'r';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2412:
                if (str.equals("KW")) {
                    c10 = 's';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2414:
                if (str.equals("KY")) {
                    c10 = 't';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2415:
                if (str.equals("KZ")) {
                    c10 = 'u';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2421:
                if (str.equals("LA")) {
                    c10 = 'v';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2422:
                if (str.equals("LB")) {
                    c10 = 'w';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2423:
                if (str.equals("LC")) {
                    c10 = 'x';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2429:
                if (str.equals("LI")) {
                    c10 = 'y';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2431:
                if (str.equals("LK")) {
                    c10 = 'z';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2438:
                if (str.equals("LR")) {
                    c10 = '{';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2439:
                if (str.equals("LS")) {
                    c10 = '|';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2440:
                if (str.equals("LT")) {
                    c10 = '}';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2441:
                if (str.equals("LU")) {
                    c10 = '~';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2442:
                if (str.equals("LV")) {
                    c10 = '\u007f';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2445:
                if (str.equals("LY")) {
                    c10 = '\u0080';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2452:
                if (str.equals("MA")) {
                    c10 = '\u0081';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2454:
                if (str.equals("MC")) {
                    c10 = '\u0082';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2455:
                if (str.equals("MD")) {
                    c10 = '\u0083';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2456:
                if (str.equals("ME")) {
                    c10 = '\u0084';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2457:
                if (str.equals("MF")) {
                    c10 = '\u0085';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2458:
                if (str.equals("MG")) {
                    c10 = '\u0086';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2459:
                if (str.equals("MH")) {
                    c10 = '\u0087';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2462:
                if (str.equals("MK")) {
                    c10 = '\u0088';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2463:
                if (str.equals("ML")) {
                    c10 = '\u0089';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2464:
                if (str.equals("MM")) {
                    c10 = '\u008a';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2465:
                if (str.equals("MN")) {
                    c10 = '\u008b';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2466:
                if (str.equals("MO")) {
                    c10 = '\u008c';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2467:
                if (str.equals("MP")) {
                    c10 = '\u008d';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2468:
                if (str.equals("MQ")) {
                    c10 = '\u008e';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2469:
                if (str.equals("MR")) {
                    c10 = '\u008f';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2470:
                if (str.equals("MS")) {
                    c10 = '\u0090';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2471:
                if (str.equals("MT")) {
                    c10 = '\u0091';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2472:
                if (str.equals("MU")) {
                    c10 = '\u0092';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2473:
                if (str.equals("MV")) {
                    c10 = '\u0093';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2474:
                if (str.equals("MW")) {
                    c10 = '\u0094';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2475:
                if (str.equals("MX")) {
                    c10 = '\u0095';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2476:
                if (str.equals("MY")) {
                    c10 = '\u0096';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2477:
                if (str.equals("MZ")) {
                    c10 = '\u0097';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2483:
                if (str.equals("NA")) {
                    c10 = '\u0098';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2485:
                if (str.equals("NC")) {
                    c10 = '\u0099';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2487:
                if (str.equals("NE")) {
                    c10 = '\u009a';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2488:
                if (str.equals("NF")) {
                    c10 = '\u009b';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2489:
                if (str.equals("NG")) {
                    c10 = '\u009c';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2491:
                if (str.equals("NI")) {
                    c10 = '\u009d';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2494:
                if (str.equals("NL")) {
                    c10 = '\u009e';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2497:
                if (str.equals("NO")) {
                    c10 = '\u009f';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2498:
                if (str.equals("NP")) {
                    c10 = '\u00a0';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2500:
                if (str.equals("NR")) {
                    c10 = '\u00a1';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2503:
                if (str.equals("NU")) {
                    c10 = '\u00a2';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2508:
                if (str.equals("NZ")) {
                    c10 = '\u00a3';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2526:
                if (str.equals("OM")) {
                    c10 = '\u00a4';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2545:
                if (str.equals("PA")) {
                    c10 = '\u00a5';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2549:
                if (str.equals("PE")) {
                    c10 = '\u00a6';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2550:
                if (str.equals("PF")) {
                    c10 = '\u00a7';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2551:
                if (str.equals("PG")) {
                    c10 = '\u00a8';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2552:
                if (str.equals("PH")) {
                    c10 = '\u00a9';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2555:
                if (str.equals("PK")) {
                    c10 = '\u00aa';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2556:
                if (str.equals("PL")) {
                    c10 = '\u00ab';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2557:
                if (str.equals("PM")) {
                    c10 = '\u00ac';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2562:
                if (str.equals("PR")) {
                    c10 = '\u00ad';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2563:
                if (str.equals("PS")) {
                    c10 = '\u00ae';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2564:
                if (str.equals("PT")) {
                    c10 = '\u00af';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2567:
                if (str.equals("PW")) {
                    c10 = '\u00b0';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2569:
                if (str.equals("PY")) {
                    c10 = '\u00b1';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2576:
                if (str.equals("QA")) {
                    c10 = '\u00b2';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2611:
                if (str.equals("RE")) {
                    c10 = '\u00b3';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2621:
                if (str.equals("RO")) {
                    c10 = '\u00b4';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2625:
                if (str.equals("RS")) {
                    c10 = '\u00b5';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2627:
                if (str.equals("RU")) {
                    c10 = '\u00b6';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2629:
                if (str.equals("RW")) {
                    c10 = '\u00b7';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2638:
                if (str.equals("SA")) {
                    c10 = '\u00b8';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2639:
                if (str.equals("SB")) {
                    c10 = '\u00b9';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2640:
                if (str.equals("SC")) {
                    c10 = '\u00ba';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2641:
                if (str.equals("SD")) {
                    c10 = '\u00bb';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2642:
                if (str.equals("SE")) {
                    c10 = '\u00bc';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2644:
                if (str.equals("SG")) {
                    c10 = '\u00bd';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2645:
                if (str.equals("SH")) {
                    c10 = '\u00be';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2646:
                if (str.equals("SI")) {
                    c10 = '\u00bf';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2647:
                if (str.equals("SJ")) {
                    c10 = '\u00c0';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2648:
                if (str.equals("SK")) {
                    c10 = '\u00c1';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2649:
                if (str.equals("SL")) {
                    c10 = '\u00c2';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2650:
                if (str.equals("SM")) {
                    c10 = '\u00c3';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2651:
                if (str.equals("SN")) {
                    c10 = '\u00c4';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2652:
                if (str.equals("SO")) {
                    c10 = '\u00c5';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2655:
                if (str.equals("SR")) {
                    c10 = '\u00c6';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2656:
                if (str.equals("SS")) {
                    c10 = '\u00c7';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2657:
                if (str.equals("ST")) {
                    c10 = '\u00c8';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2659:
                if (str.equals("SV")) {
                    c10 = '\u00c9';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2661:
                if (str.equals("SX")) {
                    c10 = '\u00ca';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2662:
                if (str.equals("SY")) {
                    c10 = '\u00cb';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2663:
                if (str.equals("SZ")) {
                    c10 = '\u00cc';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2671:
                if (str.equals("TC")) {
                    c10 = '\u00cd';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2672:
                if (str.equals("TD")) {
                    c10 = '\u00ce';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2675:
                if (str.equals("TG")) {
                    c10 = '\u00cf';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2676:
                if (str.equals("TH")) {
                    c10 = '\u00d0';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2678:
                if (str.equals("TJ")) {
                    c10 = '\u00d1';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2680:
                if (str.equals("TL")) {
                    c10 = '\u00d2';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2681:
                if (str.equals("TM")) {
                    c10 = '\u00d3';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2682:
                if (str.equals("TN")) {
                    c10 = '\u00d4';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2683:
                if (str.equals("TO")) {
                    c10 = '\u00d5';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2686:
                if (str.equals("TR")) {
                    c10 = '\u00d6';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2688:
                if (str.equals("TT")) {
                    c10 = '\u00d7';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2690:
                if (str.equals("TV")) {
                    c10 = '\u00d8';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2691:
                if (str.equals("TW")) {
                    c10 = '\u00d9';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2694:
                if (str.equals("TZ")) {
                    c10 = '\u00da';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2700:
                if (str.equals("UA")) {
                    c10 = '\u00db';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2706:
                if (str.equals("UG")) {
                    c10 = '\u00dc';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2718:
                if (str.equals("US")) {
                    c10 = '\u00dd';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2724:
                if (str.equals("UY")) {
                    c10 = '\u00de';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2725:
                if (str.equals("UZ")) {
                    c10 = '\u00df';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2731:
                if (str.equals("VA")) {
                    c10 = '\u00e0';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2733:
                if (str.equals("VC")) {
                    c10 = '\u00e1';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2735:
                if (str.equals("VE")) {
                    c10 = '\u00e2';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2737:
                if (str.equals("VG")) {
                    c10 = '\u00e3';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2739:
                if (str.equals("VI")) {
                    c10 = '\u00e4';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2744:
                if (str.equals("VN")) {
                    c10 = '\u00e5';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2751:
                if (str.equals("VU")) {
                    c10 = '\u00e6';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2767:
                if (str.equals("WF")) {
                    c10 = '\u00e7';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2780:
                if (str.equals(ListeningPointExt.WS)) {
                    c10 = '\u00e8';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2803:
                if (str.equals("XK")) {
                    c10 = '\u00e9';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2828:
                if (str.equals("YE")) {
                    c10 = '\u00ea';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2843:
                if (str.equals("YT")) {
                    c10 = '\u00eb';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2855:
                if (str.equals("ZA")) {
                    c10 = '\u00ec';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2867:
                if (str.equals("ZM")) {
                    c10 = '\u00ed';
                    break;
                }
                c10 = '\uffff';
                break;
            case 2877:
                if (str.equals("ZW")) {
                    c10 = '\u00ee';
                    break;
                }
                c10 = '\uffff';
                break;
            default:
                c10 = '\uffff';
                break;
        }
        switch (c10) {
            case 0:
            case 4:
            case 17:
            case 29:
            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
            case '9':
            case 'q':
            case 't':
            case '\u00ca':
            case '\u00e1':
                return new int[]{1, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 2, 3, 4, 1};
            case 2:
            case '\u00cc':
                return new int[]{4, 4, 3, 4, 2, 2};
            case 3:
            case ')':
                return new int[]{2, 4, 3, 4, 2, 2};
            case 5:
                return new int[]{1, 1, 1, 2, 2, 2};
            case 6:
            case '\u00a5':
                return new int[]{2, 3, 2, 3, 2, 2};
            case 7:
                return new int[]{3, 4, 4, 3, 2, 2};
            case '\b':
            case '?':
            case '\u00a2':
            case '\u00ba':
            case '\u00be':
                return new int[]{4, 2, 2, 2, 2, 2};
            case '\t':
                return new int[]{2, 2, 2, 2, 1, 2};
            case '\n':
                return new int[]{2, 2, 3, 3, 2, 2};
            case 11:
            case '=':
            case ']':
            case 'f':
            case '\u007f':
            case '\u0091':
            case '\u00bc':
                return new int[]{0, 0, 0, 0, 0, 2};
            case '\f':
                return new int[]{0, 3, 1, 1, 3, 0};
            case '\r':
                return new int[]{2, 2, 3, 4, 2, 2};
            case 14:
            case '3':
            case 'y':
            case '\u0090':
            case '\u00ac':
            case '\u00c3':
            case '\u00e0':
                return new int[]{0, 2, 2, 2, 2, 2};
            case 15:
            case '7':
            case '\u0080':
            case '\u00c2':
                return new int[]{4, 2, 3, 3, 2, 2};
            case 16:
            case 'j':
            case '\u00d6':
                return new int[]{1, 1, 1, 1, 2, 2};
            case 18:
                return new int[]{2, 1, 3, 2, 4, 2};
            case 19:
                return new int[]{0, 0, 1, 0, 1, 2};
            case 20:
            case '\u00bb':
            case '\u00cb':
            case '\u00ce':
                return new int[]{4, 3, 4, 4, 2, 2};
            case 21:
            case '\u00af':
            case '\u00bf':
                return new int[]{0, 0, 0, 0, 1, 2};
            case 22:
                return new int[]{1, 3, 1, 3, 4, 2};
            case 23:
            case 'T':
            case '\\':
            case '\u009a':
            case '\u00e2':
            case '\u00ea':
                return new int[]{4, 4, 4, 4, 2, 2};
            case 24:
                return new int[]{4, 4, 2, 3, 2, 2};
            case 25:
            case '\u008d':
            case '\u00b1':
                return new int[]{1, 2, 2, 2, 2, 2};
            case 26:
                return new int[]{0, 2, 0, 0, 2, 2};
            case 27:
                return new int[]{3, 2, 0, 0, 2, 2};
            case 28:
                return new int[]{1, 2, 4, 4, 2, 2};
            case 30:
                return new int[]{1, 1, 1, 1, 2, 4};
            case 31:
                return new int[]{3, 2, 1, 1, 2, 2};
            case ' ':
                return new int[]{3, 1, 2, 2, 3, 2};
            case '!':
                return new int[]{3, 2, 1, 0, 2, 2};
            case '\"':
                return new int[]{1, 2, 3, 3, 2, 2};
            case '#':
            case '*':
                return new int[]{2, 2, 2, 1, 2, 2};
            case '$':
            case '\u00db':
                return new int[]{0, 2, 1, 2, 3, 3};
            case '%':
            case '\u0089':
                return new int[]{3, 3, 2, 2, 2, 2};
            case '&':
                return new int[]{4, 2, 4, 2, 2, 2};
            case '\'':
            case '>':
            case '\u0086':
                return new int[]{3, 4, 3, 3, 2, 2};
            case '(':
                return new int[]{0, 1, 0, 0, 0, 2};
            case '+':
            case '\u00d0':
                return new int[]{0, 1, 2, 2, 2, 2};
            case ',':
            case '\u008f':
                return new int[]{4, 3, 3, 4, 2, 2};
            case '-':
                return new int[]{2, 0, 1, 1, 3, 1};
            case '.':
                return new int[]{2, 3, 3, 2, 2, 2};
            case '/':
            case '\u009d':
                return new int[]{2, 4, 4, 4, 2, 2};
            case y.f44626f /* 48 */:
            case 'o':
            case '\u00a1':
            case '\u00d2':
                return new int[]{4, 2, 4, 4, 2, 2};
            case '1':
                return new int[]{2, 3, 0, 1, 2, 2};
            case '4':
                return new int[]{1, 0, 1, 0, 0, 2};
            case '5':
                return new int[]{0, 0, 2, 0, 1, 2};
            case '6':
                return new int[]{0, 1, 4, 2, 2, 1};
            case '8':
                return new int[]{0, 0, 2, 0, 0, 2};
            case ':':
            case '{':
                return new int[]{3, 4, 4, 4, 2, 2};
            case ';':
            case '\u00d1':
                return new int[]{3, 3, 4, 4, 2, 2};
            case '<':
                return new int[]{1, 3, 2, 1, 2, 2};
            case '@':
                return new int[]{0, 0, 0, 0, 1, 0};
            case 'A':
                return new int[]{4, 3, 4, 4, 4, 2};
            case 'B':
                return new int[]{0, 0, 0, 1, 0, 2};
            case 'C':
                return new int[]{3, 2, 2, 3, 2, 2};
            case 'D':
            case '\u009b':
            case '\u00c0':
                return new int[]{3, 2, 2, 2, 2, 2};
            case 'E':
                return new int[]{4, 2, 4, 0, 2, 2};
            case 'F':
                return new int[]{0, 2, 2, 0, 2, 2};
            case 'G':
                return new int[]{1, 1, 1, 1, 0, 2};
            case 'H':
                return new int[]{3, 4, 0, 0, 2, 2};
            case 'I':
                return new int[]{1, 1, 3, 2, 2, 2};
            case 'J':
                return new int[]{2, 2, 0, 0, 2, 2};
            case 'K':
                return new int[]{1, 1, 0, 2, 2, 2};
            case 'L':
                return new int[]{3, 2, 3, 3, 2, 2};
            case 'M':
                return new int[]{0, 2, 1, 1, 2, 2};
            case 'N':
                return new int[]{3, 3, 3, 2, 2, 2};
            case 'O':
            case 'a':
            case 'h':
                return new int[]{0, 2, 0, 1, 2, 2};
            case 'P':
            case '\u0082':
                return new int[]{1, 2, 2, 0, 2, 2};
            case 'Q':
            case '\u00c7':
                return new int[]{4, 3, 2, 4, 2, 2};
            case 'R':
                return new int[]{3, 4, 4, 2, 2, 2};
            case 'S':
                return new int[]{2, 1, 1, 3, 2, 2};
            case 'U':
                return new int[]{1, 0, 0, 0, 1, 2};
            case 'V':
                return new int[]{2, 1, 2, 1, 2, 2};
            case 'W':
                return new int[]{2, 2, 4, 3, 3, 2};
            case 'X':
                return new int[]{4, 4, 1, 2, 2, 2};
            case 'Y':
                return new int[]{3, 1, 1, 3, 2, 2};
            case 'Z':
                return new int[]{0, 1, 0, 1, 1, 0};
            case '[':
            case 's':
                return new int[]{1, 0, 0, 0, 0, 2};
            case '^':
                return new int[]{3, 1, 3, 3, 2, 4};
            case '_':
                return new int[]{1, 1, 1, 1, 1, 2};
            case '`':
                return new int[]{1, 2, 2, 3, 4, 2};
            case 'b':
                return new int[]{1, 1, 3, 2, 2, 3};
            case 'c':
                return new int[]{3, 2, 2, 0, 2, 2};
            case 'd':
                return new int[]{3, 2, 3, 2, 2, 2};
            case 'e':
                return new int[]{4, 2, 3, 3, 4, 3};
            case 'g':
                return new int[]{0, 1, 1, 2, 1, 2};
            case 'i':
                return new int[]{2, 4, 3, 1, 2, 2};
            case 'k':
                return new int[]{0, 3, 2, 3, 4, 2};
            case 'l':
                return new int[]{3, 2, 1, 1, 1, 2};
            case 'm':
                return new int[]{2, 1, 1, 2, 2, 2};
            case 'n':
                return new int[]{1, 0, 4, 2, 2, 2};
            case 'p':
            case '\u00e6':
                return new int[]{4, 3, 3, 2, 2, 2};
            case 'r':
                return new int[]{0, 2, 2, 4, 4, 4};
            case 'u':
                return new int[]{2, 1, 2, 2, 3, 2};
            case 'v':
                return new int[]{1, 2, 1, 3, 2, 2};
            case 'w':
                return new int[]{3, 1, 1, 2, 2, 2};
            case 'x':
                return new int[]{2, 2, 1, 1, 2, 2};
            case 'z':
            case '\u008a':
                return new int[]{3, 2, 3, 3, 4, 2};
            case '|':
            case '\u00a8':
                return new int[]{4, 3, 3, 3, 2, 2};
            case '}':
                return new int[]{0, 1, 0, 1, 0, 2};
            case '~':
                return new int[]{4, 0, 3, 2, 1, 3};
            case '\u0081':
                return new int[]{3, 3, 1, 1, 2, 2};
            case '\u0083':
                return new int[]{1, 0, 0, 0, 2, 2};
            case '\u0084':
                return new int[]{2, 0, 0, 1, 3, 2};
            case '\u0085':
                return new int[]{1, 2, 2, 3, 2, 2};
            case '\u0087':
            case '\u00d3':
            case '\u00d8':
            case '\u00e7':
                return new int[]{4, 2, 2, 4, 2, 2};
            case '\u0088':
                return new int[]{1, 0, 0, 1, 3, 2};
            case '\u008b':
                return new int[]{2, 0, 2, 2, 2, 2};
            case '\u008c':
                return new int[]{0, 2, 4, 4, 3, 1};
            case '\u008e':
                return new int[]{2, 1, 2, 3, 2, 2};
            case '\u0092':
                return new int[]{3, 1, 0, 2, 2, 2};
            case '\u0093':
                return new int[]{3, 2, 1, 3, 4, 2};
            case '\u0094':
                return new int[]{3, 2, 2, 1, 2, 2};
            case '\u0095':
                return new int[]{2, 4, 4, 4, 3, 2};
            case '\u0096':
                return new int[]{1, 0, 4, 1, 1, 0};
            case '\u0097':
            case '\u00e8':
                return new int[]{3, 1, 2, 2, 2, 2};
            case '\u0098':
                return new int[]{3, 4, 3, 2, 2, 2};
            case '\u0099':
            case '\u00eb':
                return new int[]{2, 3, 3, 4, 2, 2};
            case '\u009c':
                return new int[]{3, 4, 2, 1, 2, 2};
            case '\u009e':
                return new int[]{2, 1, 4, 3, 0, 4};
            case '\u009f':
                return new int[]{0, 0, 3, 0, 0, 2};
            case '\u00a0':
                return new int[]{2, 2, 4, 3, 2, 2};
            case '\u00a3':
                return new int[]{0, 0, 1, 2, 4, 2};
            case '\u00a4':
                return new int[]{2, 3, 1, 2, 4, 2};
            case '\u00a6':
                return new int[]{1, 2, 4, 4, 3, 2};
            case '\u00a7':
                return new int[]{2, 2, 3, 1, 2, 2};
            case '\u00a9':
                return new int[]{2, 1, 2, 3, 2, 1};
            case '\u00aa':
                return new int[]{3, 3, 3, 3, 2, 2};
            case '\u00ab':
                return new int[]{1, 0, 2, 2, 4, 4};
            case '\u00ad':
                return new int[]{2, 0, 2, 1, 2, 0};
            case '\u00ae':
                return new int[]{3, 4, 1, 3, 2, 2};
            case '\u00b0':
                return new int[]{2, 2, 4, 1, 2, 2};
            case '\u00b2':
                return new int[]{1, 4, 4, 4, 4, 2};
            case '\u00b3':
                return new int[]{0, 3, 2, 3, 1, 2};
            case '\u00b4':
                return new int[]{0, 0, 1, 1, 3, 2};
            case '\u00b5':
                return new int[]{1, 0, 0, 1, 2, 2};
            case '\u00b6':
                return new int[]{1, 0, 0, 1, 3, 3};
            case '\u00b7':
                return new int[]{3, 3, 2, 0, 2, 2};
            case '\u00b8':
                return new int[]{3, 1, 1, 2, 2, 0};
            case '\u00b9':
            case '\u00ee':
                return new int[]{4, 2, 4, 3, 2, 2};
            case '\u00bd':
                return new int[]{2, 3, 3, 3, 1, 1};
            case '\u00c1':
                return new int[]{0, 1, 1, 1, 2, 2};
            case '\u00c4':
                return new int[]{4, 4, 3, 2, 2, 2};
            case '\u00c5':
                return new int[]{2, 2, 3, 4, 4, 2};
            case '\u00c6':
                return new int[]{2, 4, 4, 1, 2, 2};
            case RCHTTPStatusCodes.SUCCESS /* 200 */:
                return new int[]{2, 2, 1, 2, 2, 2};
            case RCHTTPStatusCodes.CREATED /* 201 */:
                return new int[]{2, 3, 2, 1, 2, 2};
            case '\u00cd':
                return new int[]{3, 2, 1, 2, 2, 2};
            case '\u00cf':
                return new int[]{3, 4, 1, 0, 2, 2};
            case '\u00d4':
                return new int[]{3, 1, 1, 1, 2, 2};
            case '\u00d5':
                return new int[]{3, 2, 4, 3, 2, 2};
            case '\u00d7':
                return new int[]{2, 4, 1, 0, 2, 2};
            case '\u00d9':
                return new int[]{0, 0, 0, 0, 0, 0};
            case '\u00da':
                return new int[]{3, 4, 2, 1, 3, 2};
            case '\u00dc':
                return new int[]{3, 3, 2, 3, 4, 2};
            case '\u00dd':
                return new int[]{2, 2, 4, 1, 3, 1};
            case '\u00de':
                return new int[]{2, 1, 1, 2, 1, 2};
            case '\u00df':
                return new int[]{1, 2, 3, 4, 3, 2};
            case '\u00e3':
                return new int[]{2, 2, 1, 1, 2, 4};
            case '\u00e4':
                return new int[]{0, 2, 1, 2, 2, 2};
            case '\u00e5':
                return new int[]{0, 0, 1, 2, 2, 2};
            case '\u00e9':
                return new int[]{1, 2, 1, 1, 2, 2};
            case '\u00ec':
                return new int[]{2, 4, 2, 1, 1, 2};
            case '\u00ed':
                return new int[]{4, 4, 4, 3, 2, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    public final long b(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        P p10 = this.f7981a;
        Long l10 = (Long) p10.get(valueOf);
        if (l10 == null) {
            l10 = (Long) p10.get(0);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    public final void c(long j6, int i10, long j10) {
        if (i10 == 0 && j6 == 0 && j10 == this.f7992l) {
            return;
        }
        this.f7992l = j10;
        Iterator it = ((CopyOnWriteArrayList) this.f7982b.f5033Z).iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!bVar.f7961c) {
                bVar.f7959a.post(new RunnableC0069m(bVar, i10, j6, j10, 1));
            }
        }
    }
}
