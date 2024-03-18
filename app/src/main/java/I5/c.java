package I5;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class c extends o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8065Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ d f8066Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i10) {
        super(0);
        this.f8065Y = i10;
        this.f8066Z = dVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final String mo122invoke() {
        int i10 = this.f8065Y;
        d dVar = this.f8066Z;
        switch (i10) {
            case 0:
                return String.format(Locale.US, "The provided root dir is not writable: %s", Arrays.copyOf(new Object[]{dVar.f8068Y.getPath()}, 1));
            case 1:
                return String.format(Locale.US, "The provided root file is not a directory: %s", Arrays.copyOf(new Object[]{dVar.f8068Y.getPath()}, 1));
            default:
                return String.format(Locale.US, "The provided root dir can't be created: %s", Arrays.copyOf(new Object[]{dVar.f8068Y.getPath()}, 1));
        }
    }
}
