package V1;

import android.graphics.Rect;
import android.transition.Transition;

/* loaded from: classes.dex */
public final class T extends Transition.EpicenterCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18115a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Rect f18116b;

    public /* synthetic */ T(Rect rect, int i10) {
        this.f18115a = i10;
        this.f18116b = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        int i10 = this.f18115a;
        Rect rect = this.f18116b;
        switch (i10) {
            case 0:
                return rect;
            default:
                if (rect == null || rect.isEmpty()) {
                    return null;
                }
                return rect;
        }
    }
}
