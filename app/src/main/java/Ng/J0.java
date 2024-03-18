package Ng;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class J0 extends CancellationException implements AbstractC1089x {

    /* renamed from: Y  reason: collision with root package name */
    public final transient AbstractC1073l0 f12892Y;

    public J0(String str, AbstractC1073l0 abstractC1073l0) {
        super(str);
        this.f12892Y = abstractC1073l0;
    }

    @Override // Ng.AbstractC1089x
    public final Throwable a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        J0 j02 = new J0(message, this.f12892Y);
        j02.initCause(this);
        return j02;
    }
}
