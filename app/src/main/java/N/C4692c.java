package n;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import o.AbstractC4863a;

/* renamed from: n.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4692c extends AbstractC4694e {

    /* renamed from: Y  reason: collision with root package name */
    public final ObjectAnimator f39519Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f39520Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.animation.TimeInterpolator, n.d, java.lang.Object] */
    public C4692c(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
        int i10;
        int i11;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i12 = z10 ? numberOfFrames - 1 : 0;
        if (z10) {
            i10 = 0;
        } else {
            i10 = numberOfFrames - 1;
        }
        ?? obj = new Object();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        obj.f39522b = numberOfFrames2;
        int[] iArr = obj.f39521a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            obj.f39521a = new int[numberOfFrames2];
        }
        int[] iArr2 = obj.f39521a;
        int i13 = 0;
        for (int i14 = 0; i14 < numberOfFrames2; i14++) {
            if (z10) {
                i11 = (numberOfFrames2 - i14) - 1;
            } else {
                i11 = i14;
            }
            int duration = animationDrawable.getDuration(i11);
            iArr2[i14] = duration;
            i13 += duration;
        }
        obj.f39523c = i13;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i12, i10);
        AbstractC4863a.a(ofInt, true);
        ofInt.setDuration(obj.f39523c);
        ofInt.setInterpolator(obj);
        this.f39520Z = z11;
        this.f39519Y = ofInt;
    }

    @Override // n.AbstractC4694e
    public final boolean c() {
        return this.f39520Z;
    }

    @Override // n.AbstractC4694e
    public final void o() {
        this.f39519Y.reverse();
    }

    @Override // n.AbstractC4694e
    public final void p() {
        this.f39519Y.start();
    }

    @Override // n.AbstractC4694e
    public final void q() {
        this.f39519Y.cancel();
    }
}
