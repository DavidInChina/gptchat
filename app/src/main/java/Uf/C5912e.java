package uf;

import id.AbstractC3557B;
import java.io.File;

/* renamed from: uf.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5912e extends AbstractC5909b {

    /* renamed from: b  reason: collision with root package name */
    public boolean f46750b;

    /* renamed from: c  reason: collision with root package name */
    public File[] f46751c;

    /* renamed from: d  reason: collision with root package name */
    public int f46752d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C5913f f46753e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5912e(C5913f c5913f, File file) {
        super(file);
        AbstractC3557B.c0("rootDir", file);
        this.f46753e = c5913f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
        if (r0.length == 0) goto L21;
     */
    @Override // uf.AbstractC5914g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final File a() {
        boolean z10 = this.f46750b;
        File file = this.f46756a;
        C5913f c5913f = this.f46753e;
        if (!z10) {
            c5913f.f46755i0.getClass();
            this.f46750b = true;
            return file;
        }
        File[] fileArr = this.f46751c;
        if (fileArr != null) {
            int i10 = this.f46752d;
            AbstractC3557B.Z(fileArr);
            if (i10 >= fileArr.length) {
                c5913f.f46755i0.getClass();
                return null;
            }
        }
        if (this.f46751c == null) {
            File[] listFiles = file.listFiles();
            this.f46751c = listFiles;
            if (listFiles == null) {
                c5913f.f46755i0.getClass();
            }
            File[] fileArr2 = this.f46751c;
            if (fileArr2 != null) {
                AbstractC3557B.Z(fileArr2);
            }
            c5913f.f46755i0.getClass();
            return null;
        }
        File[] fileArr3 = this.f46751c;
        AbstractC3557B.Z(fileArr3);
        int i11 = this.f46752d;
        this.f46752d = i11 + 1;
        return fileArr3[i11];
    }
}
