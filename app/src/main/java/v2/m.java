package v2;

import android.content.Context;

/* loaded from: classes.dex */
public final class m implements AbstractC5968g {

    /* renamed from: a  reason: collision with root package name */
    public final Context f47105a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC5968g f47106b;

    public m(Context context) {
        o oVar = new o();
        this.f47105a = context.getApplicationContext();
        this.f47106b = oVar;
    }

    @Override // v2.AbstractC5968g
    public final AbstractC5969h a() {
        return new n(this.f47105a, this.f47106b.a());
    }
}
