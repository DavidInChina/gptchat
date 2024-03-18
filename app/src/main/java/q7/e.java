package Q7;

import D1.Z;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final View f14467a;

    /* renamed from: b  reason: collision with root package name */
    public int f14468b;

    /* renamed from: c  reason: collision with root package name */
    public int f14469c;

    /* renamed from: d  reason: collision with root package name */
    public int f14470d;

    public e(View view) {
        this.f14467a = view;
    }

    public final void a() {
        int i10 = this.f14470d;
        View view = this.f14467a;
        int top = i10 - (view.getTop() - this.f14468b);
        WeakHashMap weakHashMap = Z.f3247a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f14469c));
    }
}
