package G8;

import H8.f;
import java.nio.charset.Charset;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements E8.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6073a;

    @Override // E8.a
    public final void a(Object obj, Object obj2) {
        switch (this.f6073a) {
            case 0:
                E8.e eVar = (E8.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                E8.e eVar2 = (E8.e) obj2;
                Charset charset = f.f7483f;
                eVar2.a(f.f7484g, entry.getKey());
                eVar2.a(f.f7485h, entry.getValue());
                return;
            default:
                E8.e eVar3 = (E8.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
