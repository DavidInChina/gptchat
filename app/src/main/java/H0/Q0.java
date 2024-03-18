package H0;

import android.view.RenderNode;

/* loaded from: classes2.dex */
public final class Q0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Q0 f6870a = new Object();

    public final int a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public final int b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public final void c(RenderNode renderNode, int i10) {
        renderNode.setAmbientShadowColor(i10);
    }

    public final void d(RenderNode renderNode, int i10) {
        renderNode.setSpotShadowColor(i10);
    }
}
