package A5;

import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final a f654Z = new a(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final a f655h0 = new a(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final a f656i0 = new a(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final a f657j0 = new a(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final a f658k0 = new a(4);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f659Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        super(0);
        this.f659Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final String mo122invoke() {
        switch (this.f659Y) {
            case 0:
                return "Ignoring provided User-Agent header, because it is reserved.";
            case 1:
                return "Unable to create the request, probably due to bad data format. The batch will be dropped.";
            case 2:
                return "Unable to execute the request; we will retry later.";
            case 3:
                return "Unable to gzip request body";
            default:
                return "Datadog has not been initialized.";
        }
    }
}
