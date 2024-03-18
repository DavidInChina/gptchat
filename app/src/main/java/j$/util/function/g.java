package j$.util.function;

import java.util.function.Predicate;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f35360a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Predicate f35361b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Predicate f35362c;

    public /* synthetic */ g(Predicate predicate, Predicate predicate2, int i10) {
        this.f35360a = i10;
        this.f35361b = predicate;
        this.f35362c = predicate2;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f35360a) {
            case 0:
                return j$.com.android.tools.r8.a.a(this, predicate);
            default:
                return j$.com.android.tools.r8.a.a(this, predicate);
        }
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.f35360a) {
            case 0:
                return j$.com.android.tools.r8.a.f(this);
            default:
                return j$.com.android.tools.r8.a.f(this);
        }
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.f35360a) {
            case 0:
                return j$.com.android.tools.r8.a.g(this, predicate);
            default:
                return j$.com.android.tools.r8.a.g(this, predicate);
        }
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i10 = this.f35360a;
        Predicate predicate = this.f35362c;
        Predicate predicate2 = this.f35361b;
        switch (i10) {
            case 0:
                return predicate2.test(obj) && predicate.test(obj);
            default:
                return predicate2.test(obj) || predicate.test(obj);
        }
    }
}
