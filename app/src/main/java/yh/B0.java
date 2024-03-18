package yh;

import yh.l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public abstract class B0 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final B0 f50916Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ B0[] f50917Z;
    /* JADX INFO: Fake field, exist only in values array */
    B0 EF0;

    static {
        B0 b02 = new B0() { // from class: yh.z0
            @Override // yh.B0
            public final void a(StringBuilder sb2, l1 l1Var, l1.a aVar) {
                String str;
                if (aVar != null) {
                    sb2.append(aVar.getTypeName());
                    sb2.append('.');
                    EnumC6628o c10 = aVar.c();
                    c10.getClass();
                    if (c10 == EnumC6628o.f51059h0) {
                        str = l1Var.o();
                    } else {
                        str = l1Var.getName();
                    }
                    sb2.append(str);
                    return;
                }
                sb2.append(l1Var.getName());
            }
        };
        B0 b03 = new B0() { // from class: yh.A0
            @Override // yh.B0
            public final void a(StringBuilder sb2, l1 l1Var, l1.a aVar) {
                if (aVar != null) {
                    sb2.append(aVar.getTypeName());
                    sb2.append('$');
                    EnumC6628o c10 = aVar.c();
                    c10.getClass();
                    if (c10 == EnumC6628o.f51059h0) {
                        String name = l1Var.getName();
                        sb2.append(name.replace(aVar.l0().getName() + "$", ""));
                        return;
                    }
                    sb2.append(l1Var.o());
                    return;
                }
                sb2.append(l1Var.getName());
            }
        };
        f50917Z = new B0[]{b02, b03};
        if (ph.f.i(ph.f.f43189k0).d(ph.f.f43192n0)) {
            b02 = b03;
        }
        f50916Y = b02;
    }

    public static B0 valueOf(String str) {
        return (B0) Enum.valueOf(B0.class, str);
    }

    public static B0[] values() {
        return (B0[]) f50917Z.clone();
    }

    public abstract void a(StringBuilder sb2, l1 l1Var, l1.a aVar);
}
