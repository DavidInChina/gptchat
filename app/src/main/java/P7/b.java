package P7;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import io.sentry.android.core.AbstractC3612c;
import java.util.ArrayList;
import w.C6049A;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final C6049A f13842a = new C6049A();

    /* renamed from: b  reason: collision with root package name */
    public final C6049A f13843b = new C6049A();

    public static b a(Context context, int i10) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (loadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return b(arrayList);
        } catch (Exception e10) {
            AbstractC3612c.s("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i10), e10);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [P7.c, java.lang.Object] */
    public static b b(ArrayList arrayList) {
        b bVar = new b();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) arrayList.get(i10);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                bVar.f13843b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
                    if (interpolator instanceof AccelerateInterpolator) {
                        interpolator = a.f13840c;
                    } else if (interpolator instanceof DecelerateInterpolator) {
                        interpolator = a.f13841d;
                    }
                } else {
                    interpolator = a.f13839b;
                }
                ?? obj = new Object();
                obj.f13847d = 0;
                obj.f13848e = 1;
                obj.f13844a = startDelay;
                obj.f13845b = duration;
                obj.f13846c = interpolator;
                obj.f13847d = objectAnimator.getRepeatCount();
                obj.f13848e = objectAnimator.getRepeatMode();
                bVar.f13842a.put(propertyName, obj);
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f13842a.equals(((b) obj).f13842a);
    }

    public final int hashCode() {
        return this.f13842a.hashCode();
    }

    public final String toString() {
        return Separators.RETURN + b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f13842a + "}\n";
    }
}
