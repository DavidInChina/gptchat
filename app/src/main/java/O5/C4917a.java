package o5;

import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* renamed from: o5.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4917a extends o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final C4917a f40600Z = new C4917a(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C4917a f40601h0 = new C4917a(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f40602Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4917a(int i10) {
        super(0);
        this.f40602Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f40602Y;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return "The Datadog library has already been initialized.";
                    default:
                        return "Cannot create SDK instance ID, stopping SDK initialization.";
                }
            default:
                switch (i10) {
                    case 0:
                        return "The Datadog library has already been initialized.";
                    default:
                        return "Cannot create SDK instance ID, stopping SDK initialization.";
                }
        }
    }
}
