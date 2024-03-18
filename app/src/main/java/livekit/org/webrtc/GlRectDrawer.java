package livekit.org.webrtc;

import livekit.org.webrtc.GlGenericDrawer;

/* loaded from: classes2.dex */
public class GlRectDrawer extends GlGenericDrawer {
    private static final String FRAGMENT_SHADER = "void main() {\n  gl_FragColor = sample(tc);\n}\n";

    /* loaded from: classes2.dex */
    public static class ShaderCallbacks implements GlGenericDrawer.ShaderCallbacks {
        private ShaderCallbacks() {
        }

        public /* synthetic */ ShaderCallbacks(int i10) {
            this();
        }

        @Override // livekit.org.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onNewShader(GlShader glShader) {
        }

        @Override // livekit.org.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onPrepareShader(GlShader glShader, float[] fArr, int i10, int i11, int i12, int i13) {
        }
    }

    public GlRectDrawer() {
        super(FRAGMENT_SHADER, new ShaderCallbacks(0));
    }

    @Override // livekit.org.webrtc.GlGenericDrawer, livekit.org.webrtc.RendererCommon.GlDrawer
    public /* bridge */ /* synthetic */ void drawOes(int i10, float[] fArr, int i11, int i12, int i13, int i14, int i15, int i16) {
        super.drawOes(i10, fArr, i11, i12, i13, i14, i15, i16);
    }

    @Override // livekit.org.webrtc.GlGenericDrawer, livekit.org.webrtc.RendererCommon.GlDrawer
    public /* bridge */ /* synthetic */ void drawRgb(int i10, float[] fArr, int i11, int i12, int i13, int i14, int i15, int i16) {
        super.drawRgb(i10, fArr, i11, i12, i13, i14, i15, i16);
    }

    @Override // livekit.org.webrtc.GlGenericDrawer, livekit.org.webrtc.RendererCommon.GlDrawer
    public /* bridge */ /* synthetic */ void drawYuv(int[] iArr, float[] fArr, int i10, int i11, int i12, int i13, int i14, int i15) {
        super.drawYuv(iArr, fArr, i10, i11, i12, i13, i14, i15);
    }

    @Override // livekit.org.webrtc.GlGenericDrawer, livekit.org.webrtc.RendererCommon.GlDrawer
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }
}
