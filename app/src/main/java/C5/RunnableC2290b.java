package c5;

import android.content.res.Resources;
import android.view.animation.AnimationUtils;
import f5.C2937a;

/* renamed from: c5.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2290b implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f26248Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2294f f26249Z;

    public /* synthetic */ RunnableC2290b(int i10, C2294f c2294f) {
        this.f26248Y = i10;
        this.f26249Z = c2294f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f26248Y;
        C2294f c2294f = this.f26249Z;
        switch (i10) {
            case 0:
                int i11 = C2294f.f26254I1;
                c2294f.T("View creation error");
                return;
            case 1:
                c2294f.getClass();
                if (c2294f.m() != null) {
                    try {
                        c2294f.f26265s1.startAnimation(AnimationUtils.loadAnimation(c2294f.m(), 0));
                    } catch (Resources.NotFoundException e10) {
                        C2937a.d("ChallengeFragment", e10.toString(), new Throwable[0]);
                    }
                }
                c2294f.f26265s1.setVisibility(0);
                return;
            default:
                c2294f.f26265s1.setVisibility(8);
                return;
        }
    }
}
