package j1;

/* loaded from: classes.dex */
public final class h extends m {
    @Override // j1.d
    public final void a(d dVar) {
        f fVar = this.f36000h;
        if (!fVar.f35977c || fVar.f35984j) {
            return;
        }
        fVar.d((int) ((((f) fVar.f35986l.get(0)).f35981g * ((i1.h) this.f35994b).f32584d0) + 0.5f));
    }

    @Override // j1.m
    public final void d() {
        i1.d dVar = this.f35994b;
        i1.h hVar = (i1.h) dVar;
        int i10 = hVar.f32585e0;
        int i11 = hVar.f32586f0;
        int i12 = hVar.f32588h0;
        f fVar = this.f36000h;
        if (i12 == 1) {
            if (i10 != -1) {
                fVar.f35986l.add(dVar.f32472I.f32492d.f36000h);
                this.f35994b.f32472I.f32492d.f36000h.f35985k.add(fVar);
                fVar.f35980f = i10;
            } else if (i11 != -1) {
                fVar.f35986l.add(dVar.f32472I.f32492d.f36001i);
                this.f35994b.f32472I.f32492d.f36001i.f35985k.add(fVar);
                fVar.f35980f = -i11;
            } else {
                fVar.f35976b = true;
                fVar.f35986l.add(dVar.f32472I.f32492d.f36001i);
                this.f35994b.f32472I.f32492d.f36001i.f35985k.add(fVar);
            }
            m(this.f35994b.f32492d.f36000h);
            m(this.f35994b.f32492d.f36001i);
            return;
        }
        if (i10 != -1) {
            fVar.f35986l.add(dVar.f32472I.f32493e.f36000h);
            this.f35994b.f32472I.f32493e.f36000h.f35985k.add(fVar);
            fVar.f35980f = i10;
        } else if (i11 != -1) {
            fVar.f35986l.add(dVar.f32472I.f32493e.f36001i);
            this.f35994b.f32472I.f32493e.f36001i.f35985k.add(fVar);
            fVar.f35980f = -i11;
        } else {
            fVar.f35976b = true;
            fVar.f35986l.add(dVar.f32472I.f32493e.f36001i);
            this.f35994b.f32472I.f32493e.f36001i.f35985k.add(fVar);
        }
        m(this.f35994b.f32493e.f36000h);
        m(this.f35994b.f32493e.f36001i);
    }

    @Override // j1.m
    public final void e() {
        i1.d dVar = this.f35994b;
        int i10 = ((i1.h) dVar).f32588h0;
        f fVar = this.f36000h;
        if (i10 == 1) {
            dVar.f32477N = fVar.f35981g;
        } else {
            dVar.f32478O = fVar.f35981g;
        }
    }

    @Override // j1.m
    public final void f() {
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
