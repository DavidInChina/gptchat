package Ba;

import Ca.C0290g;
import Vc.q;
import Vc.r;
import Vc.w;
import Vc.x;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import ld.C4428a;
import ld.C4429b;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final l f2029a;

    /* renamed from: b  reason: collision with root package name */
    public final C0290g f2030b;

    /* renamed from: c  reason: collision with root package name */
    public final Ia.j f2031c;

    public j(l lVar, C4429b c4429b, C4428a c4428a, C0290g c0290g) {
        this.f2029a = lVar;
        this.f2030b = c0290g;
        Ad.l.O0(c4428a, null, null, new d(this, null), 3);
        c4429b.a(new e(this, null));
        this.f2031c = lVar.f44961e;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC4825e abstractC4825e) {
        f fVar;
        int i10;
        x xVar;
        j jVar;
        if (abstractC4825e instanceof f) {
            fVar = (f) abstractC4825e;
            int i11 = fVar.f2018i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f2018i0 = i11 - Integer.MIN_VALUE;
                Object obj = fVar.f2016Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = fVar.f2018i0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            xVar = new w(y.f36177a);
                            return xVar.b();
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar = fVar.f2015Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    fVar.f2015Y = this;
                    fVar.f2018i0 = 1;
                    obj = this.f2030b.a(fVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    jVar = this;
                }
                xVar = (x) obj;
                if (!(xVar instanceof w)) {
                    l lVar = jVar.f2029a;
                    g gVar = new g((c) ((w) xVar).f18565a, 0);
                    fVar.f2015Y = null;
                    fVar.f2018i0 = 2;
                    if (lVar.b(gVar, fVar) == enumC5000a) {
                        return enumC5000a;
                    }
                    xVar = new w(y.f36177a);
                    return xVar.b();
                }
                if (!(xVar instanceof q) && !(xVar instanceof r)) {
                    throw new RuntimeException();
                }
                return xVar.b();
            }
        }
        fVar = new f(this, abstractC4825e);
        Object obj2 = fVar.f2016Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = fVar.f2018i0;
        if (i10 == 0) {
        }
        xVar = (x) obj2;
        if (!(xVar instanceof w)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(boolean z10, AbstractC4825e abstractC4825e) {
        h hVar;
        int i10;
        x xVar;
        j jVar;
        if (abstractC4825e instanceof h) {
            hVar = (h) abstractC4825e;
            int i11 = hVar.f2024i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f2024i0 = i11 - Integer.MIN_VALUE;
                Object obj = hVar.f2022Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = hVar.f2024i0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            xVar = new w(y.f36177a);
                            return xVar.b();
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar = hVar.f2021Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    hVar.f2021Y = this;
                    hVar.f2024i0 = 1;
                    obj = this.f2030b.c(z10, hVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    jVar = this;
                }
                xVar = (x) obj;
                if (!(xVar instanceof w)) {
                    boolean booleanValue = ((Boolean) ((w) xVar).f18565a).booleanValue();
                    l lVar = jVar.f2029a;
                    J.c cVar = new J.c(6, booleanValue);
                    hVar.f2021Y = null;
                    hVar.f2024i0 = 2;
                    if (lVar.b(cVar, hVar) == enumC5000a) {
                        return enumC5000a;
                    }
                    xVar = new w(y.f36177a);
                    return xVar.b();
                }
                if (!(xVar instanceof q) && !(xVar instanceof r)) {
                    throw new RuntimeException();
                }
                return xVar.b();
            }
        }
        hVar = new h(this, abstractC4825e);
        Object obj2 = hVar.f2022Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = hVar.f2024i0;
        if (i10 == 0) {
        }
        xVar = (x) obj2;
        if (!(xVar instanceof w)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(c cVar, AbstractC4825e abstractC4825e) {
        i iVar;
        int i10;
        x xVar;
        j jVar;
        if (abstractC4825e instanceof i) {
            iVar = (i) abstractC4825e;
            int i11 = iVar.f2028i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.f2028i0 = i11 - Integer.MIN_VALUE;
                Object obj = iVar.f2026Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = iVar.f2028i0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            xVar = new w(y.f36177a);
                            return xVar.b();
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar = iVar.f2025Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    iVar.f2025Y = this;
                    iVar.f2028i0 = 1;
                    obj = this.f2030b.b(cVar, iVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    jVar = this;
                }
                xVar = (x) obj;
                if (!(xVar instanceof w)) {
                    l lVar = jVar.f2029a;
                    g gVar = new g((c) ((w) xVar).f18565a, 1);
                    iVar.f2025Y = null;
                    iVar.f2028i0 = 2;
                    if (lVar.b(gVar, iVar) == enumC5000a) {
                        return enumC5000a;
                    }
                    xVar = new w(y.f36177a);
                    return xVar.b();
                }
                if (!(xVar instanceof q) && !(xVar instanceof r)) {
                    throw new RuntimeException();
                }
                return xVar.b();
            }
        }
        iVar = new i(this, abstractC4825e);
        Object obj2 = iVar.f2026Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = iVar.f2028i0;
        if (i10 == 0) {
        }
        xVar = (x) obj2;
        if (!(xVar instanceof w)) {
        }
    }
}
