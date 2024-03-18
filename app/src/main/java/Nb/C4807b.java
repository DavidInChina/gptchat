package nb;

import id.AbstractC3557B;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import jf.y;
import kotlin.jvm.internal.o;
import wf.k;

/* renamed from: nb.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4807b extends o implements k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f40165Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ byte[] f40166Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4807b(int i10, byte[] bArr) {
        super(1);
        this.f40165Y = i10;
        this.f40166Z = bArr;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        switch (this.f40165Y) {
            case 0:
                OutputStream outputStream = (OutputStream) obj;
                AbstractC3557B.c0("it", outputStream);
                outputStream.write(this.f40166Z);
                return yVar;
            default:
                AbstractC3557B.c0("it", (ByteBuffer) obj);
                return yVar;
        }
    }
}
