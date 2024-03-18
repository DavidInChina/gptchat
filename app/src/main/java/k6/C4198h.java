package k6;

import kotlin.jvm.internal.o;
import t6.C5678a;
import wf.AbstractC6216a;

/* renamed from: k6.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4198h extends o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f37135Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4199i f37136Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4198h(C4199i c4199i, int i10) {
        super(0);
        this.f37135Y = i10;
        this.f37136Z = c4199i;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f37135Y;
        C4199i c4199i = this.f37136Z;
        switch (i10) {
            case 0:
                return (s6.d) c4199i.f37143d.invoke(c4199i.f37140a.l());
            default:
                String str = c4199i.f37142c.f37108a;
                r5.d dVar = c4199i.f37140a;
                return new C5678a(str, new S4.o(new n6.g(dVar.l())), dVar.l());
        }
    }
}
