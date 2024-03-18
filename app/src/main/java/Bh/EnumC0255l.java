package Bh;

import yh.l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Bh.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class EnumC0255l extends Enum implements AbstractC0257m {

    /* renamed from: Y  reason: collision with root package name */
    public static final C0251j f2359Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ EnumC0255l[] f2360Z;

    static {
        C0251j c0251j = new C0251j();
        f2359Y = c0251j;
        f2360Z = new EnumC0255l[]{c0251j, new EnumC0255l() { // from class: Bh.k
            @Override // Bh.AbstractC0257m
            public final AbstractC0263p a(l1 l1Var) {
                return new C0259n(l1Var);
            }
        }};
    }

    public static EnumC0255l valueOf(String str) {
        return (EnumC0255l) Enum.valueOf(EnumC0255l.class, str);
    }

    public static EnumC0255l[] values() {
        return (EnumC0255l[]) f2360Z.clone();
    }
}
