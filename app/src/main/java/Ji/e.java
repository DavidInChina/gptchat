package Ji;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ long f9293Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ long f9294Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f9295h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ g f9296i0;

    public e(g gVar, long j6, long j10, long j11) {
        this.f9296i0 = gVar;
        this.f9293Y = j6;
        this.f9294Z = j10;
        this.f9295h0 = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar = this.f9296i0;
        int ordinal = gVar.f9300Y.ordinal();
        long j6 = this.f9295h0;
        long j10 = this.f9294Z;
        long j11 = this.f9293Y;
        switch (ordinal) {
            case 0:
            case 1:
            case 2:
            case 10:
            case 11:
                while (j11 < j10) {
                    r.f9309a.putByte((gVar.f9302h0 * j11) + j6, (byte) 0);
                    j11++;
                }
                return;
            case 3:
                while (j11 < j10) {
                    r.f9309a.putShort((gVar.f9302h0 * j11) + j6, (short) 0);
                    j11++;
                }
                return;
            case 4:
                while (j11 < j10) {
                    r.f9309a.putInt((gVar.f9302h0 * j11) + j6, 0);
                    j11++;
                }
                return;
            case 5:
                while (j11 < j10) {
                    r.f9309a.putLong((gVar.f9302h0 * j11) + j6, 0L);
                    j11++;
                }
                return;
            case 6:
                while (j11 < j10) {
                    r.f9309a.putFloat((gVar.f9302h0 * j11) + j6, 0.0f);
                    j11++;
                }
                return;
            case 7:
                while (j11 < j10) {
                    r.f9309a.putDouble((gVar.f9302h0 * j11) + j6, 0.0d);
                    j11++;
                }
                return;
            case 8:
            case 9:
            default:
                throw new IllegalArgumentException("Invalid array type.");
        }
    }
}
