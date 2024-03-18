package f8;

import nf.AbstractC4828h;

/* loaded from: classes2.dex */
public final class i extends AbstractC4828h {
    @Override // nf.AbstractC4828h
    public final void O(float f6, float f10, t tVar) {
        tVar.d(f10 * f6, 180.0f, 90.0f);
        float f11 = f10 * 2.0f * f6;
        p pVar = new p(0.0f, 0.0f, f11, f11);
        pVar.f29746f = 180.0f;
        pVar.f29747g = 90.0f;
        tVar.f29759g.add(pVar);
        n nVar = new n(pVar);
        tVar.a(180.0f);
        tVar.f29760h.add(nVar);
        tVar.f29757e = 270.0f;
        float f12 = (0.0f + f11) * 0.5f;
        float f13 = (f11 - 0.0f) / 2.0f;
        double d10 = 270.0f;
        tVar.f29755c = (((float) Math.cos(Math.toRadians(d10))) * f13) + f12;
        tVar.f29756d = (f13 * ((float) Math.sin(Math.toRadians(d10)))) + f12;
    }
}
