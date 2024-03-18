package Kh;

import E9.f;
import Hh.k;
import Hh.m;
import Hh.n;
import Ih.b;
import yh.l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class a extends Enum implements Ih.a {

    /* renamed from: Y  reason: collision with root package name */
    public static final a f9852Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ a[] f9853Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [Kh.a, java.lang.Enum] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f9852Y = r12;
        f9853Z = new a[]{r12};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f9853Z.clone();
    }

    @Override // Ih.a
    public final n a(l1.a aVar, l1.a aVar2, int i10) {
        boolean a12 = aVar.a1();
        k kVar = k.f7814Y;
        m mVar = m.f7819Y;
        if (!a12 && !aVar2.a1()) {
            if (aVar.l0().K0(aVar2.l0())) {
                return mVar;
            }
            if (f.l(i10)) {
                return b.h(aVar2);
            }
            return kVar;
        } else if (aVar.equals(aVar2)) {
            return mVar;
        } else {
            return kVar;
        }
    }
}
