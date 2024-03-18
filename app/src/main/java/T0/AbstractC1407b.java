package T0;

import android.graphics.RectF;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import q0.C5252d;

/* renamed from: T0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1407b {
    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, C5252d c5252d) {
        EditorBoundsInfo.Builder editorBounds;
        EditorBoundsInfo.Builder handwritingBounds;
        EditorBoundsInfo build;
        CursorAnchorInfo.Builder editorBoundsInfo;
        EditorBoundsInfo.Builder m10 = E1.g.m();
        float f6 = c5252d.f43625a;
        float f10 = c5252d.f43626b;
        float f11 = c5252d.f43627c;
        float f12 = c5252d.f43628d;
        editorBounds = m10.setEditorBounds(new RectF(f6, f10, f11, f12));
        handwritingBounds = editorBounds.setHandwritingBounds(new RectF(c5252d.f43625a, f10, f11, f12));
        build = handwritingBounds.build();
        editorBoundsInfo = builder.setEditorBoundsInfo(build);
        return editorBoundsInfo;
    }
}
