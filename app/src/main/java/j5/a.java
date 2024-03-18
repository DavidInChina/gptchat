package J5;

import G5.d;
import id.AbstractC3557B;
import java.io.File;
import java.util.Set;
import l8.AbstractC4344b;
import p5.AbstractC5091c;

/* loaded from: classes2.dex */
public final class a implements d {

    /* renamed from: Y  reason: collision with root package name */
    public final File f8856Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC5091c f8857Z;

    public a(File file, AbstractC5091c abstractC5091c) {
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        this.f8856Y = file;
        this.f8857Z = abstractC5091c;
    }

    @Override // G5.d
    public final File J(Set set) {
        File file = this.f8856Y;
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            AbstractC4344b.M0(parentFile, this.f8857Z);
        }
        if (set.contains(file)) {
            return null;
        }
        return file;
    }

    @Override // G5.d
    public final File K() {
        return null;
    }

    @Override // G5.d
    public final File s(File file) {
        return null;
    }

    @Override // G5.d
    public final File v(boolean z10) {
        File file = this.f8856Y;
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            AbstractC4344b.M0(parentFile, this.f8857Z);
        }
        return file;
    }
}
