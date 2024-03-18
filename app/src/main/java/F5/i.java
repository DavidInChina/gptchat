package F5;

import N.C1040y;
import id.AbstractC3557B;
import java.io.File;
import p5.AbstractC5091c;
import p5.EnumC5090b;
import t5.AbstractC5676b;

/* loaded from: classes.dex */
public final class i implements AbstractC5676b {

    /* renamed from: a  reason: collision with root package name */
    public final File f5051a;

    /* renamed from: b  reason: collision with root package name */
    public final G5.h f5052b;

    /* renamed from: c  reason: collision with root package name */
    public final G5.e f5053c;

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC5091c f5054d;

    public i(File file, File file2, I5.f fVar, G5.g gVar, G5.e eVar, AbstractC5091c abstractC5091c) {
        AbstractC3557B.c0("eventsWriter", fVar);
        AbstractC3557B.c0("metadataReaderWriter", gVar);
        AbstractC3557B.c0("filePersistenceConfig", eVar);
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        this.f5051a = file;
        this.f5052b = fVar;
        this.f5053c = eVar;
        this.f5054d = abstractC5091c;
    }

    @Override // t5.AbstractC5676b
    public final boolean a(t5.d dVar) {
        byte[] bArr = dVar.f45751a;
        if (bArr.length == 0) {
            return true;
        }
        int length = bArr.length;
        int i10 = (length > this.f5053c.f6057c ? 1 : (length == this.f5053c.f6057c ? 0 : -1));
        EnumC5090b enumC5090b = EnumC5090b.f42738Y;
        if (i10 > 0) {
            P4.a.m0(this.f5054d, 5, enumC5090b, new C1040y(length, this, 2), null, false, 56);
        } else if (this.f5052b.b(this.f5051a, dVar, true)) {
            return true;
        }
        return false;
    }
}
