package Bh;

import Rh.p1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Bh.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class EnumC0237c extends Enum implements AbstractC0241e {

    /* renamed from: Y  reason: collision with root package name */
    public static final C0233a f2319Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ EnumC0237c[] f2320Z;

    static {
        C0233a c0233a = new C0233a();
        f2319Y = c0233a;
        f2320Z = new EnumC0237c[]{c0233a, new EnumC0237c() { // from class: Bh.b
            @Override // Bh.AbstractC0241e
            public final C0239d a(int i10, Nh.b bVar, p1 p1Var) {
                return new C0239d(i10, p1Var);
            }
        }};
    }

    public static EnumC0237c valueOf(String str) {
        return (EnumC0237c) Enum.valueOf(EnumC0237c.class, str);
    }

    public static EnumC0237c[] values() {
        return (EnumC0237c[]) f2320Z.clone();
    }
}
