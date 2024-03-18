package n;

import android.graphics.drawable.Animatable;

/* renamed from: n.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4690a extends AbstractC4694e {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f39515Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Animatable f39516Z;

    public /* synthetic */ C4690a(Animatable animatable, int i10) {
        this.f39515Y = i10;
        this.f39516Z = animatable;
    }

    @Override // n.AbstractC4694e
    public final void p() {
        int i10 = this.f39515Y;
        Animatable animatable = this.f39516Z;
        switch (i10) {
            case 0:
                animatable.start();
                return;
            default:
                ((H3.e) animatable).start();
                return;
        }
    }

    @Override // n.AbstractC4694e
    public final void q() {
        int i10 = this.f39515Y;
        Animatable animatable = this.f39516Z;
        switch (i10) {
            case 0:
                animatable.stop();
                return;
            default:
                ((H3.e) animatable).stop();
                return;
        }
    }
}
