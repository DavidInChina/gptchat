package uf;

import id.AbstractC3557B;
import java.io.File;

/* renamed from: uf.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5910c extends AbstractC5909b {

    /* renamed from: b  reason: collision with root package name */
    public boolean f46744b;

    /* renamed from: c  reason: collision with root package name */
    public File[] f46745c;

    /* renamed from: d  reason: collision with root package name */
    public int f46746d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f46747e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ C5913f f46748f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5910c(C5913f c5913f, File file) {
        super(file);
        AbstractC3557B.c0("rootDir", file);
        this.f46748f = c5913f;
    }

    @Override // uf.AbstractC5914g
    public final File a() {
        boolean z10 = this.f46747e;
        File file = this.f46756a;
        C5913f c5913f = this.f46748f;
        if (!z10 && this.f46745c == null) {
            c5913f.f46755i0.getClass();
            File[] listFiles = file.listFiles();
            this.f46745c = listFiles;
            if (listFiles == null) {
                c5913f.f46755i0.getClass();
                this.f46747e = true;
            }
        }
        File[] fileArr = this.f46745c;
        if (fileArr != null) {
            int i10 = this.f46746d;
            AbstractC3557B.Z(fileArr);
            if (i10 < fileArr.length) {
                File[] fileArr2 = this.f46745c;
                AbstractC3557B.Z(fileArr2);
                int i11 = this.f46746d;
                this.f46746d = i11 + 1;
                return fileArr2[i11];
            }
        }
        if (!this.f46744b) {
            this.f46744b = true;
            return file;
        }
        c5913f.f46755i0.getClass();
        return null;
    }
}
