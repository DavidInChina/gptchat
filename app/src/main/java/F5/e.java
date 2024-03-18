package F5;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.io.File;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final File f5038a;

    /* renamed from: b  reason: collision with root package name */
    public final File f5039b;

    public e(File file, File file2) {
        this.f5038a = file;
        this.f5039b = file2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3557B.K(this.f5038a, eVar.f5038a) && AbstractC3557B.K(this.f5039b, eVar.f5039b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f5038a.hashCode() * 31;
        File file = this.f5039b;
        if (file == null) {
            i10 = 0;
        } else {
            i10 = file.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "Batch(file=" + this.f5038a + ", metaFile=" + this.f5039b + Separators.RPAREN;
    }
}
