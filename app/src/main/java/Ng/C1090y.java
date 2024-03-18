package Ng;

import nf.AbstractC4829i;
import nf.AbstractC4831k;

/* renamed from: Ng.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1090y extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final C1090y f12994Z = new C1090y(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C1090y f12995h0 = new C1090y(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f12996Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1090y(int i10) {
        super(2);
        this.f12996Y = i10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12996Y) {
            case 0:
                return ((AbstractC4831k) obj).plus((AbstractC4829i) obj2);
            default:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                AbstractC4829i abstractC4829i = (AbstractC4829i) obj2;
                return bool;
        }
    }
}
