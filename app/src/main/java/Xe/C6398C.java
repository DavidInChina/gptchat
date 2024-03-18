package xe;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.List;
import l8.AbstractC4344b;
import yf.AbstractC6583a;

/* renamed from: xe.C  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6398C implements Comparable {

    /* renamed from: h0  reason: collision with root package name */
    public static final C6398C f49826h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final C6398C f49827i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final C6398C f49828j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final C6398C f49829k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final C6398C f49830l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final C6398C f49831m0;

    /* renamed from: n0  reason: collision with root package name */
    public static final C6398C f49832n0;

    /* renamed from: o0  reason: collision with root package name */
    public static final C6398C f49833o0;

    /* renamed from: Y  reason: collision with root package name */
    public final int f49834Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f49835Z;

    static {
        C6398C c6398c = new C6398C(100, "Continue");
        C6398C c6398c2 = new C6398C(101, "Switching Protocols");
        f49826h0 = c6398c2;
        C6398C c6398c3 = new C6398C(102, "Processing");
        C6398C c6398c4 = new C6398C(RCHTTPStatusCodes.SUCCESS, "OK");
        C6398C c6398c5 = new C6398C(RCHTTPStatusCodes.CREATED, "Created");
        C6398C c6398c6 = new C6398C(202, "Accepted");
        C6398C c6398c7 = new C6398C(203, "Non-Authoritative Information");
        C6398C c6398c8 = new C6398C(204, "No Content");
        C6398C c6398c9 = new C6398C(205, "Reset Content");
        C6398C c6398c10 = new C6398C(206, "Partial Content");
        C6398C c6398c11 = new C6398C(207, "Multi-Status");
        C6398C c6398c12 = new C6398C(RCHTTPStatusCodes.UNSUCCESSFUL, "Multiple Choices");
        C6398C c6398c13 = new C6398C(301, "Moved Permanently");
        f49827i0 = c6398c13;
        C6398C c6398c14 = new C6398C(302, "Found");
        f49828j0 = c6398c14;
        C6398C c6398c15 = new C6398C(303, "See Other");
        f49829k0 = c6398c15;
        C6398C c6398c16 = new C6398C(RCHTTPStatusCodes.NOT_MODIFIED, "Not Modified");
        C6398C c6398c17 = new C6398C(305, "Use Proxy");
        C6398C c6398c18 = new C6398C(306, "Switch Proxy");
        C6398C c6398c19 = new C6398C(307, "Temporary Redirect");
        f49830l0 = c6398c19;
        C6398C c6398c20 = new C6398C(308, "Permanent Redirect");
        f49831m0 = c6398c20;
        C6398C c6398c21 = new C6398C(RCHTTPStatusCodes.BAD_REQUEST, "Bad Request");
        C6398C c6398c22 = new C6398C(401, "Unauthorized");
        f49832n0 = c6398c22;
        C6398C c6398c23 = new C6398C(402, "Payment Required");
        f49833o0 = c6398c23;
        List G02 = AbstractC4344b.G0(c6398c, c6398c2, c6398c3, c6398c4, c6398c5, c6398c6, c6398c7, c6398c8, c6398c9, c6398c10, c6398c11, c6398c12, c6398c13, c6398c14, c6398c15, c6398c16, c6398c17, c6398c18, c6398c19, c6398c20, c6398c21, c6398c22, c6398c23, new C6398C(403, "Forbidden"), new C6398C(RCHTTPStatusCodes.NOT_FOUND, "Not Found"), new C6398C(405, "Method Not Allowed"), new C6398C(406, "Not Acceptable"), new C6398C(407, "Proxy Authentication Required"), new C6398C(408, "Request Timeout"), new C6398C(409, "Conflict"), new C6398C(410, "Gone"), new C6398C(411, "Length Required"), new C6398C(412, "Precondition Failed"), new C6398C(413, "Payload Too Large"), new C6398C(414, "Request-URI Too Long"), new C6398C(415, "Unsupported Media Type"), new C6398C(416, "Requested Range Not Satisfiable"), new C6398C(417, "Expectation Failed"), new C6398C(422, "Unprocessable Entity"), new C6398C(423, "Locked"), new C6398C(424, "Failed Dependency"), new C6398C(425, "Too Early"), new C6398C(426, "Upgrade Required"), new C6398C(429, "Too Many Requests"), new C6398C(431, "Request Header Fields Too Large"), new C6398C(500, "Internal Server Error"), new C6398C(501, "Not Implemented"), new C6398C(502, "Bad Gateway"), new C6398C(503, "Service Unavailable"), new C6398C(504, "Gateway Timeout"), new C6398C(505, "HTTP Version Not Supported"), new C6398C(506, "Variant Also Negotiates"), new C6398C(507, "Insufficient Storage"));
        int n02 = P4.a.n0(AbstractC6583a.H1(G02, 10));
        if (n02 < 16) {
            n02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(n02);
        for (Object obj : G02) {
            linkedHashMap.put(Integer.valueOf(((C6398C) obj).f49834Y), obj);
        }
    }

    public C6398C(int i10, String str) {
        AbstractC3557B.c0("description", str);
        this.f49834Y = i10;
        this.f49835Z = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C6398C c6398c = (C6398C) obj;
        AbstractC3557B.c0("other", c6398c);
        return this.f49834Y - c6398c.f49834Y;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C6398C) && ((C6398C) obj).f49834Y == this.f49834Y) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49834Y;
    }

    public final String toString() {
        return this.f49834Y + ' ' + this.f49835Z;
    }
}
