package Zf;

import Bg.AbstractC0210c;
import Bg.D;
import Bg.k0;
import id.AbstractC3557B;
import java.util.Set;

/* loaded from: classes.dex */
public final class a extends AbstractC0210c {

    /* renamed from: a  reason: collision with root package name */
    public final k0 f23713a;

    /* renamed from: b  reason: collision with root package name */
    public final b f23714b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f23715c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f23716d;

    /* renamed from: e  reason: collision with root package name */
    public final Set f23717e;

    /* renamed from: f  reason: collision with root package name */
    public final D f23718f;

    public a(k0 k0Var, b bVar, boolean z10, boolean z11, Set set, D d10) {
        AbstractC3557B.c0("flexibility", bVar);
        this.f23713a = k0Var;
        this.f23714b = bVar;
        this.f23715c = z10;
        this.f23716d = z11;
        this.f23717e = set;
        this.f23718f = d10;
    }

    public static a f(a aVar, b bVar, boolean z10, Set set, D d10, int i10) {
        k0 k0Var = aVar.f23713a;
        if ((i10 & 2) != 0) {
            bVar = aVar.f23714b;
        }
        b bVar2 = bVar;
        if ((i10 & 4) != 0) {
            z10 = aVar.f23715c;
        }
        boolean z11 = z10;
        boolean z12 = aVar.f23716d;
        if ((i10 & 16) != 0) {
            set = aVar.f23717e;
        }
        Set set2 = set;
        if ((i10 & 32) != 0) {
            d10 = aVar.f23718f;
        }
        aVar.getClass();
        AbstractC3557B.c0("howThisTypeIsUsed", k0Var);
        AbstractC3557B.c0("flexibility", bVar2);
        return new a(k0Var, bVar2, z11, z12, set2, d10);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!AbstractC3557B.K(aVar.f23718f, this.f23718f) || aVar.f23713a != this.f23713a || aVar.f23714b != this.f23714b || aVar.f23715c != this.f23715c || aVar.f23716d != this.f23716d) {
            return false;
        }
        return true;
    }

    public final a g(b bVar) {
        return f(this, bVar, false, null, null, 61);
    }

    public final int hashCode() {
        int i10;
        D d10 = this.f23718f;
        if (d10 != null) {
            i10 = d10.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode = this.f23713a.hashCode() + (i10 * 31) + i10;
        int hashCode2 = this.f23714b.hashCode() + (hashCode * 31) + hashCode;
        int i11 = (hashCode2 * 31) + (this.f23715c ? 1 : 0) + hashCode2;
        return (i11 * 31) + (this.f23716d ? 1 : 0) + i11;
    }

    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f23713a + ", flexibility=" + this.f23714b + ", isRaw=" + this.f23715c + ", isForAnnotationParameter=" + this.f23716d + ", visitedTypeParameters=" + this.f23717e + ", defaultType=" + this.f23718f + ')';
    }

    public /* synthetic */ a(k0 k0Var, boolean z10, boolean z11, Set set, int i10) {
        this(k0Var, b.f23719Y, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? null : set, null);
    }
}
