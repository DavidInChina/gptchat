package m4;

import java.io.File;
import q4.n;

/* renamed from: m4.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4560a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f38940a;

    public C4560a(boolean z10) {
        this.f38940a = z10;
    }

    @Override // m4.b
    public final String a(Object obj, n nVar) {
        File file = (File) obj;
        if (this.f38940a) {
            return file.getPath() + ':' + file.lastModified();
        }
        return file.getPath();
    }
}
