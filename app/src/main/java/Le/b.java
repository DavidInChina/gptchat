package Le;

import java.nio.charset.MalformedInputException;

/* loaded from: classes2.dex */
public class b extends MalformedInputException {

    /* renamed from: Y  reason: collision with root package name */
    public final String f11061Y;

    public b(String str) {
        super(0);
        this.f11061Y = str;
    }

    @Override // java.nio.charset.MalformedInputException, java.lang.Throwable
    public final String getMessage() {
        return this.f11061Y;
    }
}
