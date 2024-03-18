package Eh;

import yh.l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Eh.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class EnumC0521u extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final C0519s f4807Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final C0520t f4808Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ EnumC0521u[] f4809h0;

    static {
        C0519s c0519s = new C0519s();
        f4807Y = c0519s;
        C0520t c0520t = new C0520t();
        f4808Z = c0520t;
        f4809h0 = new EnumC0521u[]{c0519s, c0520t};
    }

    public static EnumC0521u valueOf(String str) {
        return (EnumC0521u) Enum.valueOf(EnumC0521u.class, str);
    }

    public static EnumC0521u[] values() {
        return (EnumC0521u[]) f4809h0.clone();
    }

    public abstract r a(Bh.M m10, l1 l1Var);
}
