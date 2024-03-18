package o8;

import android.os.Bundle;
import u8.AbstractBinderC5863m;

/* loaded from: classes.dex */
public abstract class l extends AbstractBinderC5863m {

    /* renamed from: b  reason: collision with root package name */
    public final N7.f f40963b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p f40964c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p pVar, N7.f fVar) {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback", 5);
        this.f40964c = pVar;
        this.f40963b = fVar;
    }

    @Override // u8.AbstractC5864n
    public void d(Bundle bundle) {
        this.f40964c.f40976f.c(this.f40963b);
    }

    @Override // u8.AbstractC5864n
    public void f(Bundle bundle) {
        this.f40964c.f40976f.c(this.f40963b);
    }
}
