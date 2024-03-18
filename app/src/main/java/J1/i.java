package j1;

import i1.C3456a;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i extends m {
    @Override // j1.d
    public final void a(d dVar) {
        C3456a c3456a = (C3456a) this.f35994b;
        int i10 = c3456a.f32437f0;
        f fVar = this.f36000h;
        Iterator it = fVar.f35986l.iterator();
        int i11 = 0;
        int i12 = -1;
        while (it.hasNext()) {
            int i13 = ((f) it.next()).f35981g;
            if (i12 == -1 || i13 < i12) {
                i12 = i13;
            }
            if (i11 < i13) {
                i11 = i13;
            }
        }
        if (i10 != 0 && i10 != 2) {
            fVar.d(i11 + c3456a.f32439h0);
        } else {
            fVar.d(i12 + c3456a.f32439h0);
        }
    }

    @Override // j1.m
    public final void d() {
        i1.d dVar = this.f35994b;
        if (dVar instanceof C3456a) {
            f fVar = this.f36000h;
            fVar.f35976b = true;
            C3456a c3456a = (C3456a) dVar;
            int i10 = c3456a.f32437f0;
            boolean z10 = c3456a.f32438g0;
            int i11 = 0;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            fVar.f35979e = 7;
                            while (i11 < c3456a.f32590e0) {
                                i1.d dVar2 = c3456a.f32589d0[i11];
                                if (z10 || dVar2.f32481V != 8) {
                                    f fVar2 = dVar2.f32493e.f36001i;
                                    fVar2.f35985k.add(fVar);
                                    fVar.f35986l.add(fVar2);
                                }
                                i11++;
                            }
                            m(this.f35994b.f32493e.f36000h);
                            m(this.f35994b.f32493e.f36001i);
                            return;
                        }
                        return;
                    }
                    fVar.f35979e = 6;
                    while (i11 < c3456a.f32590e0) {
                        i1.d dVar3 = c3456a.f32589d0[i11];
                        if (z10 || dVar3.f32481V != 8) {
                            f fVar3 = dVar3.f32493e.f36000h;
                            fVar3.f35985k.add(fVar);
                            fVar.f35986l.add(fVar3);
                        }
                        i11++;
                    }
                    m(this.f35994b.f32493e.f36000h);
                    m(this.f35994b.f32493e.f36001i);
                    return;
                }
                fVar.f35979e = 5;
                while (i11 < c3456a.f32590e0) {
                    i1.d dVar4 = c3456a.f32589d0[i11];
                    if (z10 || dVar4.f32481V != 8) {
                        f fVar4 = dVar4.f32492d.f36001i;
                        fVar4.f35985k.add(fVar);
                        fVar.f35986l.add(fVar4);
                    }
                    i11++;
                }
                m(this.f35994b.f32492d.f36000h);
                m(this.f35994b.f32492d.f36001i);
                return;
            }
            fVar.f35979e = 4;
            while (i11 < c3456a.f32590e0) {
                i1.d dVar5 = c3456a.f32589d0[i11];
                if (z10 || dVar5.f32481V != 8) {
                    f fVar5 = dVar5.f32492d.f36000h;
                    fVar5.f35985k.add(fVar);
                    fVar.f35986l.add(fVar5);
                }
                i11++;
            }
            m(this.f35994b.f32492d.f36000h);
            m(this.f35994b.f32492d.f36001i);
        }
    }

    @Override // j1.m
    public final void e() {
        i1.d dVar = this.f35994b;
        if (dVar instanceof C3456a) {
            int i10 = ((C3456a) dVar).f32437f0;
            f fVar = this.f36000h;
            if (i10 != 0 && i10 != 1) {
                dVar.f32478O = fVar.f35981g;
            } else {
                dVar.f32477N = fVar.f35981g;
            }
        }
    }

    @Override // j1.m
    public final void f() {
        this.f35995c = null;
        this.f36000h.c();
    }

    @Override // j1.m
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f36000h;
        fVar2.f35985k.add(fVar);
        fVar.f35986l.add(fVar2);
    }
}
