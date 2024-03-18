package v2;

import java.io.IOException;

/* loaded from: classes.dex */
public class i extends IOException {

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ int f47077Z = 0;

    /* renamed from: Y  reason: collision with root package name */
    public final int f47078Y;

    public i(int i10) {
        this.f47078Y = i10;
    }

    public i(int i10, Throwable th2) {
        super(th2);
        this.f47078Y = i10;
    }

    public i(String str, int i10) {
        super(str);
        this.f47078Y = i10;
    }

    public i(int i10, String str, Throwable th2) {
        super(str, th2);
        this.f47078Y = i10;
    }
}
