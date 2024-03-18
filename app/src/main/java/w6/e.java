package w6;

import android.view.Window;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f48044Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Window f48045Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Window window, int i10) {
        super(0);
        this.f48044Y = i10;
        this.f48045Z = window;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final String mo122invoke() {
        int i10 = this.f48044Y;
        Window window = this.f48045Z;
        switch (i10) {
            case 0:
                return "Disabling jankStats for window " + window;
            case 1:
                return "Resuming jankStats for window " + window;
            default:
                return "Starting jankStats for window " + window;
        }
    }
}
