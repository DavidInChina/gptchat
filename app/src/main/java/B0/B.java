package B0;

import android.view.MotionEvent;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class B extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f1586Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ D f1587Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(D d10, int i10) {
        super(1);
        this.f1586Y = i10;
        this.f1587Z = d10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        D d10 = this.f1587Z;
        int i10 = this.f1586Y;
        switch (i10) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                switch (i10) {
                    case 0:
                        wf.k kVar = d10.f1591b;
                        if (kVar != null) {
                            kVar.invoke(motionEvent);
                            break;
                        } else {
                            AbstractC3557B.C2("onTouchEvent");
                            throw null;
                        }
                    default:
                        wf.k kVar2 = d10.f1591b;
                        if (kVar2 != null) {
                            kVar2.invoke(motionEvent);
                            break;
                        } else {
                            AbstractC3557B.C2("onTouchEvent");
                            throw null;
                        }
                }
                return yVar;
            default:
                MotionEvent motionEvent2 = (MotionEvent) obj;
                switch (i10) {
                    case 0:
                        wf.k kVar3 = d10.f1591b;
                        if (kVar3 != null) {
                            kVar3.invoke(motionEvent2);
                            break;
                        } else {
                            AbstractC3557B.C2("onTouchEvent");
                            throw null;
                        }
                    default:
                        wf.k kVar4 = d10.f1591b;
                        if (kVar4 != null) {
                            kVar4.invoke(motionEvent2);
                            break;
                        } else {
                            AbstractC3557B.C2("onTouchEvent");
                            throw null;
                        }
                }
                return yVar;
        }
    }
}
