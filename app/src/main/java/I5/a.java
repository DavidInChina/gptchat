package I5;

import id.AbstractC3557B;
import java.io.File;
import java.io.FileFilter;
import jf.y;
import l8.AbstractC4344b;
import p5.AbstractC5091c;

/* loaded from: classes2.dex */
public final class a implements FileFilter {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5091c f8060a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f8061b;

    public a(d dVar, AbstractC5091c abstractC5091c) {
        this.f8061b = dVar;
        this.f8060a = abstractC5091c;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        if (file == null) {
            return false;
        }
        d dVar = this.f8061b;
        if (dVar.f8078p0.b(file) != null) {
            return true;
        }
        AbstractC5091c abstractC5091c = this.f8060a;
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        if (!((Boolean) AbstractC4344b.a1(file, Boolean.FALSE, abstractC5091c, G5.a.f6047l0)).booleanValue()) {
            return false;
        }
        String name = file.getName();
        AbstractC3557B.b0("file.name", name);
        if (!d.f8067r0.b(name)) {
            return false;
        }
        dVar.f8078p0.c(file, y.f36177a);
        return true;
    }
}
