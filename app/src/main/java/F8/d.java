package f8;

import nf.AbstractC4828h;

/* loaded from: classes2.dex */
public final class d extends AbstractC4828h {
    @Override // nf.AbstractC4828h
    public final void O(float f6, float f10, t tVar) {
        tVar.d(f10 * f6, 180.0f, 90.0f);
        double d10 = f10;
        double d11 = f6;
        tVar.c((float) (Math.sin(Math.toRadians(90.0f)) * d10 * d11), (float) (Math.sin(Math.toRadians(0.0f)) * d10 * d11));
    }
}
