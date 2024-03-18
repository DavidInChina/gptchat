package S5;

import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class a extends o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f16187Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ float f16188Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, float f6) {
        super(0);
        this.f16187Y = i10;
        this.f16188Z = f6;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        float f6 = this.f16188Z;
        int i10 = this.f16187Y;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return Float.valueOf(f6);
                    default:
                        return Float.valueOf(f6);
                }
            case 1:
                return mo122invoke();
            case 2:
                return mo122invoke();
            default:
                switch (i10) {
                    case 0:
                        return Float.valueOf(f6);
                    default:
                        return Float.valueOf(f6);
                }
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke  reason: collision with other method in class */
    public final String mo122invoke() {
        int i10 = this.f16187Y;
        float f6 = this.f16188Z;
        switch (i10) {
            case 1:
                return "Sample rate value provided " + f6 + " is below 0, setting it to 0.";
            default:
                return "Sample rate value provided " + f6 + " is above 100, setting it to 100.";
        }
    }
}
