package th;

import yh.l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: th.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class EnumC5801i extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC5801i f46224Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ EnumC5801i[] f46225Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, th.i] */
    static {
        ?? r12 = new Enum("LEGACY_VM", 0);
        EnumC5801i enumC5801i = new EnumC5801i() { // from class: th.g
            @Override // th.EnumC5801i
            public final void a(StringBuilder sb2, String str, int i10) {
                if (i10 > 1 || !str.equals("value")) {
                    sb2.append(str);
                    sb2.append('=');
                }
            }
        };
        EnumC5801i enumC5801i2 = new EnumC5801i() { // from class: th.h
            @Override // th.EnumC5801i
            public final void a(StringBuilder sb2, String str, int i10) {
                if (i10 > 1 || !str.equals("value")) {
                    sb2.append(str);
                    sb2.append('=');
                }
            }

            @Override // th.EnumC5801i
            public final void b(StringBuilder sb2, l1 l1Var) {
                sb2.append(l1Var.R0());
            }
        };
        f46225Z = new EnumC5801i[]{r12, enumC5801i, enumC5801i2};
        ph.f i10 = ph.f.i(ph.f.f43189k0);
        if (i10.d(ph.f.f43203y0)) {
            f46224Y = enumC5801i2;
        } else if (i10.d(ph.f.f43198t0)) {
            f46224Y = enumC5801i;
        } else {
            f46224Y = r12;
        }
    }

    public static EnumC5801i valueOf(String str) {
        return (EnumC5801i) Enum.valueOf(EnumC5801i.class, str);
    }

    public static EnumC5801i[] values() {
        return (EnumC5801i[]) f46225Z.clone();
    }

    public void a(StringBuilder sb2, String str, int i10) {
        sb2.append(str);
        sb2.append('=');
    }

    public void b(StringBuilder sb2, l1 l1Var) {
        sb2.append(l1Var.getName());
    }
}
