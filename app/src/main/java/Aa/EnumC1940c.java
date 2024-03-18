package aa;

import id.AbstractC3557B;
import java.util.List;
import kf.v;
import l8.AbstractC4344b;
import qf.C5323a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: aa.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1940c extends Enum {

    /* renamed from: h0  reason: collision with root package name */
    public static final R4.a f24026h0 = new Object();

    /* renamed from: i0  reason: collision with root package name */
    public static final EnumC1940c f24027i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final EnumC1940c f24028j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final EnumC1940c f24029k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final EnumC1940c f24030l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final EnumC1940c f24031m0;

    /* renamed from: n0  reason: collision with root package name */
    public static final EnumC1940c f24032n0;

    /* renamed from: o0  reason: collision with root package name */
    public static final EnumC1940c f24033o0;

    /* renamed from: p0  reason: collision with root package name */
    public static final EnumC1940c f24034p0;

    /* renamed from: q0  reason: collision with root package name */
    public static final EnumC1940c f24035q0;

    /* renamed from: r0  reason: collision with root package name */
    public static final EnumC1940c f24036r0;

    /* renamed from: s0  reason: collision with root package name */
    public static final EnumC1940c f24037s0;

    /* renamed from: t0  reason: collision with root package name */
    public static final EnumC1940c f24038t0;

    /* renamed from: u0  reason: collision with root package name */
    public static final /* synthetic */ EnumC1940c[] f24039u0;

    /* renamed from: v0  reason: collision with root package name */
    public static final /* synthetic */ C5323a f24040v0;

    /* renamed from: Y  reason: collision with root package name */
    public final String f24041Y;

    /* renamed from: Z  reason: collision with root package name */
    public final List f24042Z;

    /* JADX WARN: Type inference failed for: r0v12, types: [R4.a, java.lang.Object] */
    static {
        EnumC1940c enumC1940c = new EnumC1940c("GetCalendarEvents", 0, "getCalendarEvents", AbstractC4344b.F0("android.permission.READ_CALENDAR"));
        f24027i0 = enumC1940c;
        EnumC1940c enumC1940c2 = new EnumC1940c("GetLocation", 1, "getLocation", AbstractC4344b.F0("android.permission.ACCESS_COARSE_LOCATION"));
        f24028j0 = enumC1940c2;
        EnumC1940c enumC1940c3 = new EnumC1940c("SendMessage", 2, "sendMessage", AbstractC4344b.F0("android.permission.READ_CONTACTS"));
        f24029k0 = enumC1940c3;
        EnumC1940c enumC1940c4 = new EnumC1940c("MakeCall", 3, "makeCall", AbstractC4344b.F0("android.permission.READ_CONTACTS"));
        f24030l0 = enumC1940c4;
        v vVar = v.f37483Y;
        EnumC1940c enumC1940c5 = new EnumC1940c("StartNavigation", 4, "startNavigation", vVar);
        f24031m0 = enumC1940c5;
        EnumC1940c enumC1940c6 = new EnumC1940c("LaunchMapWithQuery", 5, "launchMapWithQuery", vVar);
        f24032n0 = enumC1940c6;
        EnumC1940c enumC1940c7 = new EnumC1940c("PlayMusic", 6, "playMusic", vVar);
        f24033o0 = enumC1940c7;
        EnumC1940c enumC1940c8 = new EnumC1940c("SetAlarm", 7, "setAlarm", vVar);
        f24034p0 = enumC1940c8;
        EnumC1940c enumC1940c9 = new EnumC1940c("OpenApp", 8, "openApp", vVar);
        f24035q0 = enumC1940c9;
        EnumC1940c enumC1940c10 = new EnumC1940c("SetTimer", 9, "setTimer", vVar);
        f24036r0 = enumC1940c10;
        EnumC1940c enumC1940c11 = new EnumC1940c("AddEvent", 10, "addEvent", vVar);
        f24037s0 = enumC1940c11;
        EnumC1940c enumC1940c12 = new EnumC1940c("GetScreenshot", 11, "getCurrentScreenshot", vVar);
        f24038t0 = enumC1940c12;
        EnumC1940c[] enumC1940cArr = {enumC1940c, enumC1940c2, enumC1940c3, enumC1940c4, enumC1940c5, enumC1940c6, enumC1940c7, enumC1940c8, enumC1940c9, enumC1940c10, enumC1940c11, enumC1940c12};
        f24039u0 = enumC1940cArr;
        f24040v0 = AbstractC3557B.C0(enumC1940cArr);
    }

    public EnumC1940c(String str, int i10, String str2, List list) {
        this.f24041Y = str2;
        this.f24042Z = list;
    }

    public static EnumC1940c valueOf(String str) {
        return (EnumC1940c) Enum.valueOf(EnumC1940c.class, str);
    }

    public static EnumC1940c[] values() {
        return (EnumC1940c[]) f24039u0.clone();
    }
}
