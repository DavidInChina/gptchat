package I5;

import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class i extends o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ String f8085Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f8086Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f8087h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, int i10, int i11) {
        super(0);
        this.f8085Y = str;
        this.f8086Z = i10;
        this.f8087h0 = i11;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        return "Number of bytes read for operation='" + this.f8085Y + "' doesn't match with expected: expected=" + this.f8086Z + ", actual=" + this.f8087h0;
    }
}
