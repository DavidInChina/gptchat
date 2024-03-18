package Hi;

import android.view.InputEvent;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final InputEvent f7881a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7882b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7883c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7884d;

    /* renamed from: e  reason: collision with root package name */
    public AbstractC6216a f7885e;

    public j(InputEvent inputEvent, long j6, long j10, int i10, AbstractC6216a abstractC6216a) {
        this.f7881a = inputEvent;
        this.f7882b = j6;
        this.f7883c = j10;
        this.f7884d = i10;
        this.f7885e = abstractC6216a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeliveredInput(deliveryUptime=");
        Mg.d dVar = Mg.d.f12133h0;
        sb2.append(Mg.b.n(this.f7882b, dVar));
        sb2.append(", eventUptime=");
        sb2.append(Mg.b.n(this.f7883c, dVar));
        sb2.append(", framesSinceDelivery=");
        sb2.append(this.f7884d);
        sb2.append(", event=");
        sb2.append(this.f7881a);
        sb2.append(')');
        return sb2.toString();
    }
}
